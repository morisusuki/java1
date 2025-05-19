import java.util.ArrayList;

public class arraylist_test {

	public static void main(String[] args) {
		
//		問1
		ArrayList <String> fluits = new ArrayList<>();
		fluits.add("banana");
		fluits.add("orange");
		fluits.add("apple");
//		問2
		System.out.println(fluits.get(1));
		
//		問3
		fluits.add(0, "strawberry");

//		問4
		fluits.set(3, "pineapple");
		
//		問5
		if (fluits.contains("apple")) {
			fluits.remove("apple");
		}
		
//		for (Stirng fluit: fluits) {
		System.out.println(fluits);
//			
//		}
	}
	

}
