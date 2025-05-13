
public class java入門 {
	
	public static void main(String[] args) {
		
		//基礎問題1
		System.out.println(
				"public class HelloWorld { \n"
				+ "    public static void main(String[] args) { \n"
				+ "        System.out.println(\"Hello, Java!\"); \n"
				+ "    }\n"
				+ "}");
		
		//基礎問題2
		int age;
		age = 25;
		System.out.println("age is " + age);
		
		//基礎問題3
		int x = 10;
		int y = 3;
		System.out.println(x / y);

		//基礎問題4
		int score;
		score = 80;
		if (score >= 80) {
			System.out.println("合格");
		}
		else {
			System.out.println("不合格");
		}
		
		//基礎問題5
		int[] nums = {1, 2, 3, 4, 5};
		for (int num : nums) {
			System.out.print(num);
		}
		System.out.println();
		
		//応用問題6
		System.out.println(add(3,5));

		//応用問題7
		String input = new java.util.Scanner(System.in).next();
		if (input.equals("yes")) {
			System.out.println("はい");
		}
		else {
			System.out.println("いいえ");
			
		}

		//応用問題8
		for (int i = 1; i <= 100; i++) {
			if (i > 30 && i % 2 == 0) {
				System.out.println(i);
				break;
			}
		}

		//応用問題9
		System.out.println(sumArray(new int[] {10,20,30}));
		
		//応用問題10
		Greeter greeter = new Greeter();
		greeter.greet();
	}
	
	//応用問題6
	public static int add(int a, int b) {
		return a + b;
	}

	//応用問題9
	public static int sumArray(int[] a) {
		int total = 0;
		for (int i : a) {
			total += i;
		}
		return total;
	}
	
	//応用問題10
	static class Greeter{
		
		public void greet() {
			System.out.print("こんにちは、Java!");
		}
	}
}

