import java.util.ArrayList;
import java.util.Collections;


public class コレクションソート {

	public static void main(String[] args) {
		
//		演習問題1
		ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        //  以下にコードを追加
        Collections.sort(numbers);
        
        System.out.println(numbers);
        
        
//      演習問題2
        ArrayList<String> members = new ArrayList<>();
        members.add("kirishima");
        members.add("midorikawa");
        members.add("rokumura");
        // 以下にコードを追加
        ArrayList<String> members_copy = new ArrayList<>(members);
        members_copy.add("nana");
        
        System.out.println("members ：" + members);
        System.out.println("members_copy ：" + members_copy);
        
        
//      応用問題1
        ArrayList<String> fruits1 = new ArrayList<>();
        fruits1.add("apple");
        fruits1.add("banana");
        fruits1.add("orange");
        
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("grape");
        fruits2.add("kiwi");
        fruits2.add("melon");
        
        //  ここに2 つのリストを結合し、ソートするコードを追加
        ArrayList<String> fruits = new ArrayList<>(fruits1);
        fruits.addAll(fruits2);
        Collections.sort(fruits);
        
        System.out.println(fruits);
        
        
//        応用問題2
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(" 田中", " 開発部", 350000));
        employees.add(new Employee(" 鈴木", " 営業部", 380000));
        employees.add(new Employee(" 佐藤", " 開発部", 400000));
        employees.add(new Employee(" 高橋", " 人事部", 320000));
        employees.add(new Employee(" 伊藤", " 開発部", 370000));
        employees.add(new Employee(" テスト1", " 開発部", 1));
        employees.add(new Employee(" テスト2", " 開発部", 100000000));

        
        
        //  ここに「開発部」の社員のみを抽出し、給与の高い順にソートするコードを追加
        ArrayList<Employee> memo = new ArrayList<>();
        ArrayList<Employee> devEmployees = new ArrayList<>();
        for (Employee employee: employees) {
        	if (employee.getDepartment().equals(" 開発部")) {
        		memo.add(employee);
        	}
        }
        
        //給与を比べる
        for (Employee employee: memo) {
        	if (devEmployees.size() == 0) {
        		devEmployees.add(employee);
        	}
        	else {
        		boolean hantei = false;
        		for (int i = 0; i < devEmployees.size(); i++) {
        			Employee dev = devEmployees.get(i);
        			if (employee.getSalary() <= dev.getSalary()) {
        				devEmployees.add(i, employee);
        				hantei = true;      				
        				break;
        			}
        		}
        		if (!hantei) {
        			devEmployees.add(employee);
        		}
        		
        	}
        }
        System.out.println(devEmployees.toString());
	}
}


class Employee {
    private String name;
    private String department;
    private int salary;
    
    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }

    public int getSalary() {
    	return salary;
    }

    @Override
	public String toString() {
    	return name + " (" + department + ", " + salary + " 円)";
    }
}

