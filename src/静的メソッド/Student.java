package 静的メソッド;

public class Student {

static int count = 0;
	
	public Student() {
		count += 1;
	}
	
	public static void showCount() {
		System.out.println("作られた人数" + count);
	}
	
	public static void main(String[] args) {
//		問題1
		new Student();
		new Student();
		
		Student.showCount();
		
		
	}

}
