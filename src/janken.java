// 応用
//import java.util.Random;
//import java.util.Scanner;

public class janken {

	public static void main(String[] args) {
		System.out.println("応用: ");
		int win = 0;
		int round = 1;
		while (round <= 3) {
			System.out.println("ラウンド" + round);
			System.out.println("グー,チョキ,パーのいずれかを入力してください。");
//			Scanner scanner = new Scanner(System.in);
//			String input = scanner.nextLine();
			String input =  new java.util.Scanner(System.in).nextLine();
			System.out.println("あなた：　" + input);
			String[] hands = {"グー", "チョキ", "パー"}; 
//			Random random = new Random();
//			int num = random.nextInt(3);
			int num = new java.util.Random().nextInt(3);
			String hand = hands[num];
			System.out.println("コンピュータ：　" + hand);
			
	//		あいこ
			if (input.equals(hand)) {
				System.out.println("あいこ");
				continue;
			}
	//		自分がグー
			else if (input.equals(hands[0])) {
	//			相手がチョキ
				if (hand.equals(hands[1])) {
					System.out.println("あなたの勝ち");
					win += 1;
				}
	//			相手がパー
				else if (hand.equals(hands[2])) {
					System.out.println("あなたの負け");
				}
			}
			
	//		自分がチョキ
			else if (input.equals(hands[1])) {
	//			相手がグー
				if (hand.equals(hands[0])) {
					System.out.println("あなたの負け");
				}
	//			相手がパー
				else if (hand.equals(hands[2])) {
					System.out.println("あなたの勝ち");
					win += 1;
				}
			}
			
	//		自分がパー
			else if (input.equals(hands[2])) {
	//			相手がグー
				if (hand.equals(hands[0])) {
					System.out.println("あなたの勝ち");
					win += 1;
				}
	//			相手がチョキ
				else if (hand.equals(hands[1])) {
					System.out.println("あなたの負け");
				}
			}
			else {
				continue;
			}
			round += 1;
		}
		if (win > 1) {
			System.out.print(win + "勝" + (3 - win) + "敗であなたの勝ち");
		}
		else {
			System.out.println(win + "勝" + (3 - win) + "敗であなたの負け");
		}

	}

}
