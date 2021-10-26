package collections;

import java.util.ArrayList;

public class ArrayListExample3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Grapes"); //Adding object in arraylist
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		//Traversing list through for-each loop
		for(String fruit:list)
			System.out.println(fruit);
	}

}
