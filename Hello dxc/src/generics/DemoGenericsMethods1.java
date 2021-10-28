package generics;

public class DemoGenericsMethods1 {
	public static void printArray(int[] elements) {
		for(int element: elements) {
			System.out.println(element);}
		System.out.println();
		}
	
	public static void main(String[] args) {
		int[] intArray = (10,20,30,40);
		printArray(intArray);
	}

}
