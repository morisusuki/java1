
public class コンストラクタ {

	public static void main(String[] args) {
	
//BOOK
	Book book = new Book("吾輩は猫である", "夏目漱石");
	book.displayInfo();
	
	
//Rectangle
	Rectangle rect1 = new Rectangle();
    Rectangle rect2 = new Rectangle(5);
    Rectangle rect3 = new Rectangle(3, 4);
    
    System.out.println("rect1の面積: " + rect1.area());
    System.out.println("rect2の面積: " + rect2.area());
    System.out.println("rect3の面積: " + rect3.area());
	
	
//Car
	Car car1 = new Car("プリウス", 2022);
    Car car2 = null;
    
    printCarInfo(car1);
    printCarInfo(car2);
    
    // car1 を null に設定
    car1 = null;
    
    printCarInfo(car1);
    
    
//Person
    // 3人の Person オブジェクトを作成
    Person[] people = new Person[3];
    people[0] = new Person("鈴木", 25);
    people[1] = new Person("佐藤", 30);
    people[2] = new Person("高橋", 22);
    
    // 全員の情報を表示
    System.out.println("===== 初期状態 =====");
    for (Person p : people) {
        p.displayInfo();
    }
    
    // 1番目の人の年齢を変更
    people[0].age = 26;
    
    // 2番目の参照を3番目と同じにする
    people[1] = people[2];
    
    // 全員の情報を再表示
    System.out.println("\n===== 変更後 =====");
    for (Person p : people) {
        p.displayInfo();
    }
    
//Student
    // Student オブジェクトを作成
    Student student1 = new Student("田中", 85);
    
    // 参照のコピー
    Student student2 = student1;
    
    // クローンの作成
    Student student3 = student1.clone();
    
    // student2 の score を変更
    student2.score = 90;
    
    // 3つのオブジェクトの情報を表示
    System.out.println("student1: " + student1.name + ", " + student1.score);
    System.out.println("student2: " + student2.name + ", " + student2.score);
    System.out.println("student3: " + student3.name + ", " + student3.score);
}
    
//Car
    public static void printCarInfo(Car car) {
    	// nullチェックを行い、安全に車の情報を表示するメソッドを実装
    	if (car != null) {
    		System.out.println(car.car_name + "　：　" + car.year);
    	}
    	else {
    		System.out.println("情報がありません");
    	}
    }
}



class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void displayInfo() {
		System.out.println("タイトル：　" + title);
		System.out.println("作者：　" + author);
	}
}


class Rectangle {
    int width;
    int height;
    
    // 複数のコンストラクタをここに実装
    public Rectangle() {
    	this.width = 1;
    	this.height = 1;
    }
    
    public Rectangle(int a) {
    	this.width = a;
    	this.height = a;
    }
    
    public Rectangle(int a, int b) {
    	this.width = a;
    	this.height = b;
    }
    
    // 面積を計算するメソッドをここに実装
    public int area() {
    	return width * height;
    }
}


class Car {
	String car_name;
	int year;
	
	public Car(String car, int year) {
		this.car_name = car;
		this.year = year;
	}
}


class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo() {
		System.out.println(name + "　：　" + age);
	}
}


class Student {
	String name;
	int score;
	
	// コンストラクタをここに実装
    public Student(String name, int score) {
    	this.name = name;
    	this.score = score;
    }
	
    // clone メソッドをここに実装
    public Student clone() {
    	return new Student(this.name, this.score);
    }
    
}