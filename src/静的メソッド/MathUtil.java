package 静的メソッド;

public class MathUtil {
	
    // static   メソッド add  をここに定義
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
        //  メソッド呼び出しと出力
    	System.out.println(MathUtil.add(3, 7));

	}

}
