package 静的メソッド;

public class Calculator {
	
//	1.add: 2つの整数を受け取り、その和を返す
	public static int add(int a, int b) {
		return a + b;
	}
	
//	2.subtract: 2つの整数を受け取り、その差を返す
	public static int subtract(int a, int b) {
		return a - b;
	}
	
//	3.multiply: 2つの整数を受け取り、その積を返す
	public static int multiply(int a, int b) {
		return a * b;
	}
	
//	4.divide: 2つの整数を受け取り、その商を返す（ゼロ除算の処理も考慮）
	public static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("0で除算はできません");
			return 0;
		}
		else {
			return a / b;
		}
	}
	
//	5.max: 2つの整数を受け取り、大きい方の値を返す
	public static int max(int a, int b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		System.out.println(add(10, 5));
		System.out.println(subtract(10, 5));
		System.out.println(multiply(10, 5));
		System.out.println(divide(10, 5));
		System.out.println(max(10, 5));

	}

}
