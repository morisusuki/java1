
public class method0509 {

	//問1
	public static void greet() {
		System.out.println("こんにちは！Javaプログラミングの世界へようこそ！");
	}
	
	//問2
	public static void showTriangle(int size) {
		for (int i = 1; i <= size; i++) {
			String str = "*".repeat(i);
			System.out.println(str);
		}
	}
	
	//問3
	public static double calcAverage(int a, int b, int c) {
		double ave = (a + b + c) / 3.0;
		return ave;
	}
	
	//演習2
	public static int sum(int a, int b) {
		return a + b;
	}
	
	//演習3
	public static double calculateCircleArea(int hankei) {
		return hankei * hankei * 3.14;
	}
	
	//演習4
	public static String checkEvenOdd(int a) {
		if (a % 2 == 0) {
			return "even";
		}
		else {
			return "odd";
		}
	}
	
	//演習5
	public static String repeat(String a, int b) {
		return a.repeat(b);
	}
	
	//演習6
	public static int findMax(int a, int b, int c) {
		int d = Math.max(a, b);
		return Math.max(c, d);
	}
	
	//演習7
	public static int calculateArea(int a) {
		return a * a;
	}
	public static int calculateArea(int a, int b) {
		return a * b;
	}
	public static double calculateArea(double a, double b) {
		return a * b / 2.0;
	}
	
	//演習8
	public static double[] calculateStats(int[] a) {
		int total = 0;
		for (int i :a) {
			total += i;
		}
		double ave = total / a.length;
		
		double[] ans = {total, ave};
		
		return ans;
	}
	
	//演習9
	public static boolean isPrime(int a) {
		boolean sosu = true;
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				sosu = false;
				break;
			}
		}
		return sosu;
	}
	
	//演習10
	public static int findMode(int[] a) {
		java.util.Map<Integer,Integer> map = new java.util.HashMap<>();
		for (int num : a) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		int ans = a[0];
		int count = 0;
		for (java.util.Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() ==  count) {
				if (entry.getKey() < ans) {
					ans = entry.getKey();
				}
			}
			
			else if (entry.getValue() > count) {
				ans = entry.getKey();
				count = entry.getValue();
			}
		}
		return ans;
	}
	
	//演習11
	public static boolean binarySearch(int[] list, int num) {
		java.util.Arrays.sort(list);
		int min = 0;
		int max = list.length - 1;
		while (min <= max) {
			int mid = min + (max - min) / 2;
			if (num == list[mid]) {
				return true;
			}
			else if (num < list[mid]) {
				max = mid - 1;
			}
			//(num > list[mid])
			else {
				min = mid + 1;
			}
		}
		return false;
	}

	
	
	public static void main(String[] args) {
		//問1
		greet();
		//問2
		showTriangle(10);
		//問3
		System.out.println(calcAverage(3,4,2));
		
		//演習2
		System.out.println(sum(9, 1));
		
		//演習3
		System.out.println(calculateCircleArea(4));
		
		//演習4
		System.out.println(checkEvenOdd(57));
		
		//演習5
		System.out.println(repeat("あ", 10));
		
		//演習6
		System.out.println(findMax(20, 4, 5));
		
		//演習7
		System.out.println(calculateArea(3.0, 4.0));
		
		//演習8
		int[] a = {10, 40, 8, 2};
		double[] b = calculateStats(a);
		for (double i : b) {
			System.out.println(i);
		}
		
		//演習9
		System.out.println(isPrime(11));
		
		//演習10
		int[] c = {1,2,6,8,4,7,9,2,4,9};
		System.out.println(findMode(c));
		
		//演習11
		int[] d = {5, 2, 8, 12, 1, 6, 3};
		System.out.println(binarySearch(d, 4));
		
		//演習12

		
	}

}
