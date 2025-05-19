import java.util.ArrayList;


public class インスタンス {

	public static void main(String[] args) {
		
//		問題1

		// 1. Player 型の変数にPlayer クラスのインスタンスを代入
        Player player = new Player();
        // 2. String  型の変数に文字列 "Java"  を代入
        String language = "java";
        // 3. Integer  型の変数に数値 42  を代入
        Integer value = 42;
        // 4. ArrayList 型の変数に新しいArrayList を代入
        ArrayList<String> items = new ArrayList<>();
        
    //  出力して確認
        System.out.println(" プレイヤーを作成しました");
        System.out.println(" 使用言語: " + language);
        System.out.println(" 値: " + value);
        System.out.println(" アイテム数: " + items.size());
        
        
//      問題2
        Monster monster = new Monster();
        String name = new String(" スライム");
        Integer hp = 100;
        
        
//      問題3
    //  自作クラスのインスタンス化
        Enemy goblin = new Enemy();
        
        //  文字列の生成
        String monsterName = "slime";
        
        //  ラッパークラスの生成
        Integer damage = 3;
        
        
//      問題4
    //  ここに4 つのクラスをインスタンス化するコードを書いてください
        Game game = new Game();
        Player player2 = new Player();
        Item item = new Item();
        Enemy enemy = new Enemy();
        
        
//      問題5
        Character hero = new Character();  // newが足りない
        String weaponName = " 剣";  // newがいらない
        Integer level = 5;  //newがいらない
        
        System.out.println(" 勇者は" + weaponName + " を装備しています");
        System.out.println(" レベルは" + level + " です");
	}

}

class Player {}
class Monster {}
class Enemy {}
class Game {}
class Item{}
class Character{}
