import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ItemShop {
  public static void main(String[] args) {
    JFrame frame = new JFrame("道具屋");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 200);
    frame.setLocationRelativeTo(null);

    JPanel panel = new JPanel();

    // アイテム一覧
    String[] items = {"やくそう", "どくけしそう", "まほうのせいすい", "せいなるナイフ"};
    int[] stock = new int[items.length];
    for (int i = 0; i < items.length; i++) {
    	stock[i] = 5;
    }

    // ★ 案内ラベルと一覧ラベルの追加
    JLabel messageLabel = new JLabel("アイテムどれが欲しいですか？");
    StringBuilder itemList = new StringBuilder("<html>");
    for (int i = 0; i < items.length; i++) {
      itemList.append(i).append(": ").append(items[i]).append("<br>");
    }
    itemList.append("</html>");
    JLabel itemListLabel = new JLabel(itemList.toString());

    JLabel label = new JLabel("アイテム番号を入力:");
    JTextField input = new JTextField(5);
    JButton button = new JButton("購入する");
    JButton history_btn = new JButton("購入履歴");
    JLabel resultLabel = new JLabel("ここにメッセージが表示されます");

    ArrayList<String> history = new ArrayList<>();
    history_btn.addActionListener(e -> {
        JOptionPane.showMessageDialog(frame, "購入履歴 \n" + history);        
    });
    button.addActionListener(e -> {
      try {
        int index = Integer.parseInt(input.getText());
        String selectedItem = items[index];
        if (stock[index] <= 0) {
            resultLabel.setText("「" + selectedItem + "」は在庫切れです！");
        }
        else {
	        stock[index] -= 1;
	        history.add(selectedItem);
	        resultLabel.setText("「" + selectedItem + "」を購入しました！");
	        resultLabel.setText(selectedItem + "の在庫数：　" + stock[index]);
        }
      } catch (ArrayIndexOutOfBoundsException ex) {
        JOptionPane.showMessageDialog(frame, "その番号のアイテムは売っていません！", "エラー",
            JOptionPane.ERROR_MESSAGE);
      } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(frame, "番号を半角数字で入力してください！", "入力エラー",
            JOptionPane.ERROR_MESSAGE);
      } catch (Exception ex) {
        //   ex.printStackTrace(); // ログ出力（開発者用）
        JOptionPane.showMessageDialog(frame,
            "想定外のエラーが発生しました。\n" + ex.toString(),
            "予期しないエラー",
            JOptionPane.ERROR_MESSAGE);
      }
    });

    // パネルに部品を追加
    panel.add(messageLabel);
    panel.add(itemListLabel);
    panel.add(label);
    panel.add(input);
    panel.add(button);
    panel.add(history_btn);
    panel.add(resultLabel);

    frame.add(panel);
    frame.setVisible(true);
  }
}
