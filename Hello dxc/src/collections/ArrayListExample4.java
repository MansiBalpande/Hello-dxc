package collections;

import java.util.ArrayList;

public class ArrayListExample4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Grapes");
        al.add("Apple");
		al.add("Banana");
		al.add("Mango");
		//accessing the element
		System.out.println("Returning element:" +al.get(1));//it will return the 2nd element
		//changing the element
		al.set(1, "Dates");
		//Traversing list
		for(String fruit:al)
			System.out.println(fruit);
		
	}

}
