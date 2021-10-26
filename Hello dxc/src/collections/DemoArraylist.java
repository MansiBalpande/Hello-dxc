package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArraylist {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("mansi");
		names.add("balpande");
		
		//names.add(30);
		System.out.println(names);
		/*
		 * for(String name : names) {//for each time in names
		 * System.out.println("the name is "+ name);}
		 */
		
		Iterator itr=names.iterator();
		while(itr.hasNext())
	    System.out.println(itr.next());
	
		 
}
		
	}


