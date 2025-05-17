//import java.util.Scanner;


public class challenge0425 {

	public static void main(String[] args) {
		boolean end = true;
		while (end) {
//			Scanner scanner = new Scanner(System.in);
//			String input = scanner.nextLine();
			String input = new java.util.Scanner(System.in).next();
			
			if (input.equals("end")) {
				end = false;
			}
			
			String[] a = {"3", "4", "9"};
			for (String num : a) {
				if (input.equals(num)) {
					System.out.println("アタリ！");
					break;
				}
			}
		}

	}

}
