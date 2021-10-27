package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stk = new Stack<>();
		stk.push("Pranesh");
		stk.push("Ranjith");
		stk.push("Rahul");
		stk.push("Surya");
		stk.push("Sathish");
		stk.pop();

		Iterator<String> itr = stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}}