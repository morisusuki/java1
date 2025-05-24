package 静的メソッド;

public class AppConfig {
	
    // APP_NAME とVERSION を定義
	static final String APP_NAME = "MyApp";
	static final double VERSION = 1.0;
	
	
    public static void main(String[] args) {
        //  出力:  アプリ名: MyApp /  バージョン: 1.0
    	System.out.println("アプリ名：　"+ APP_NAME + ",　バージョン：　" + VERSION);
    }

}
