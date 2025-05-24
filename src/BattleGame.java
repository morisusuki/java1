import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

// キャラクタークラス
class Chara {
    protected String name;
    protected int hp;
    protected int ap;

    public Chara(String name, int hp, int ap) {
        this.name = name;
        this.hp = hp;
        this.ap = ap;
    }

    public void attack(Chara target, JTextArea log) {
        log.append(name + " は攻撃した！\n");
        target.hp -= ap;
        if (target.hp < 0) target.hp = 0;
        log.append(target.name + " のHPは " + target.hp + " になった！\n");
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public String getStatus() {
        return name + "：HP=" + hp;
    }
    
    public int Damage() {
    	return ap;
    }
}

// 勇者
class Hero extends Chara {
    public Hero(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    @Override
    public void attack(Chara target, JTextArea log) {
        log.append("🔥 勇者 " + name + " のこうげき！\n");
        super.attack(target, log);
    }
}

// 敵
class Ene extends Chara {
    public Ene(String name, int hp, int ap) {
        super(name, hp, ap);
    }

    @Override
    public void attack(Chara target, JTextArea log) {
        log.append("💀 敵 " + name + " が襲いかかる！\n");
        super.attack(target, log);
    }
}

// GUIメインクラス
public class BattleGame extends JFrame {
    private Hero hero;
    private Ene dragon;
    private JTextArea log;
    private JButton attackButton;

    public BattleGame() {
        hero = new Hero("勇者アキラ", 80, 20);
//        enemy = new Ene("スライム", 30);
        dragon = new Ene("ドラゴン", 100,8);

        setTitle("勇者 vs 敵 - バトルゲーム");
        setSize(400, 300);
        setLocationRelativeTo(null); // 画面中央
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // テキストエリア
        log = new JTextArea();
        log.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(log);

        // ボタン
        attackButton = new JButton("攻撃する");
        attackButton.addActionListener(e -> performBattle());

        // レイアウト
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(attackButton, BorderLayout.SOUTH);

        add(panel);
        setVisible(true);

        log.append("戦闘スタート！\n");
        showStatus();
    }

    private void performBattle() {
        if (!hero.isAlive() || !dragon.isAlive()) {
            log.append("⚠️ 戦闘はすでに終了しています\n");
            return;
        }

        hero.attack(dragon, log);

        if (dragon.isAlive()) {
            dragon.attack(hero, log);
        } 
        else {
        	log.append(dragon.name + "は戦闘不能です。\n");
            log.append("🎉 敵を倒した！\n");
            attackButton.setEnabled(false);
        }

        if (!hero.isAlive()) {
        	log.append(hero.name + "は戦闘不能です。\n");
            log.append("💀 勇者は倒れてしまった...\n");
            attackButton.setEnabled(false);
        }

        showStatus();
    }

    private void showStatus() {
        log.append("🟢 " + hero.name + "\n");
        log.append("🔴 " + dragon.getStatus() + "\n\n");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(BattleGame::new);
    }
}
