package collections;

import java.util.Iterator;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[] ) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("lalit");
		al.add("ayush");
		al.add("sanskar");
		al.add("priya");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
