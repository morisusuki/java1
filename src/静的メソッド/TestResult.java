package 静的メソッド;

class TestResult {
    // static   変数 totalScore, studentCount  を定義
	static int totalScore;
	static int studentCount;
    
    public TestResult(int score) {
        //  合計点と人数を更新
    	totalScore += score;
    	studentCount += 1;
    }
    public static double average() {
        //  平均点を返す
    	return totalScore / studentCount;
    }
    
	public static void main(String[] args) {

    	new TestResult(80);
        new TestResult(90);
        new TestResult(70);
        //  平均点を表示
        
        System.out.println(TestResult.average());
	}
}