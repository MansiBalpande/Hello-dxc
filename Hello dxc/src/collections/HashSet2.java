package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet2 {
	public static void main(String[] args) {
		//Creating HashSet and adding elements
		HashSet<String> set=new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		boolean didAdd = set.add("Ravi");
		System.out.println(didAdd);
		set.add("Ajay");
		didAdd = set.add("Mansi");
		System.out.println(didAdd);
		//Traversing elements
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
