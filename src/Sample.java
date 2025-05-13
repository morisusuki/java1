public class Sample {

	public static void main(String[] args) {
		//第三章
		
		//問1
		System.out.println("問1: ");
		int taiju = 50;
		if (taiju > 30) {
			System.out.println("大きいね！");
		}
		
		//問2
		System.out.println("問2: ");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		//問3
		System.out.println("問3: ");
		for (int i = 2; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + ", ");
			}
		}
		System.out.println();

		
		//第四章　時間が余った人向け
		//問1
		String[] foods = {
				"うどん", "プリン", "ハンバーグ", "キムタクご飯","チョコ"
		};
		//問2
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int total = 0;
		for (int num : nums) {
			total += num;
		}
		System.out.println(total);
		
		//問3(好きな食べ物で代用)
		for (String food : foods) {
			System.out.println(food);			
		}
		
	}

}
