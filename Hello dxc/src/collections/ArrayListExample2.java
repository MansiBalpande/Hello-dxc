package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
				list.add("Grapes"); //Adding object in arraylist
		        list.add("Apple");
		        list.add("Banana");
		        list.add("Mangpo");
		        //Traversing list through Iterator
		        Iterator itr=list.iterator(); //getting the Iterator
		        while(itr.hasNext()) {
		        System.out.println(itr.next());
		        }
	}

}
