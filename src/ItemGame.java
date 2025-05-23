import java.awt.BorderLayout;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class ItemGame extends JFrame {

  // アイテム名と効果値の対応表
  private HashMap<String, Integer> itemMap = new HashMap<>();
  
  // 使用回数
  private HashMap<String, Integer> count = new HashMap<>();

  // 使用履歴（順番付き）
  private LinkedList<String> history = new LinkedList<>();

  // 表示用テキストエリア
  private JTextArea logArea;

  public ItemGame() {
    setTitle("アイテム使用ゲーム");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    // アイテムを初期登録
    itemMap.put("薬草", 50);
    itemMap.put("爆弾", 100);
    itemMap.put("聖水", 30);
    itemMap.put("エリクサー",200);
    
    for (String item: itemMap.keySet()) {
    	count.put(item, 0);
    }
    System.out.println(itemMap);

    // UI構築
    JPanel topPanel = new JPanel();
    JButton useButton = new JButton("アイテムを使う");
    JButton undoButton = new JButton("取り消す");
    JButton viewButton = new JButton("履歴表示");

    topPanel.add(useButton);
    topPanel.add(undoButton);
    topPanel.add(viewButton);
    add(topPanel, BorderLayout.NORTH);

    logArea = new JTextArea();
    logArea.setEditable(false);
    add(new JScrollPane(logArea), BorderLayout.CENTER);

    // イベント：アイテムを使う
    useButton.addActionListener(e -> {
      Object[] itemNames = itemMap.keySet().toArray();
      String selected = (String) JOptionPane.showInputDialog(this, "使うアイテムを選んでください：", "アイテム選択",
          JOptionPane.PLAIN_MESSAGE, null, itemNames, itemNames[0]);
      if (selected != null && itemMap.containsKey(selected)) {
        int effect = itemMap.get(selected);
        history.add(selected);
        count.put(selected, count.get(selected) + 1);
        logArea.append(selected + " を使った（効果値：" + effect + ", 使用回数：" + count.get(selected) + "回目）\n");
      }
    });

    // イベント：最後の操作を取り消す
    undoButton.addActionListener(e -> {
      if (!history.isEmpty()) {
        String last = history.removeLast();
        logArea.append("取り消した操作: " + last + "\n");
      } else {
        logArea.append("取り消す操作がありません。\n");
      }
    });
    
    // イベント：履歴表示
    viewButton.addActionListener(e -> {
    	logArea.append("----- 使用履歴 -----\n");
        for (String his: history) {
            logArea.append(his + "\n");
        }
        logArea.append("-------------------\n");
      });
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
      ItemGame game = new ItemGame();
      game.setVisible(true);
    });
  }
}
