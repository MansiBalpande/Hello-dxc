package calculator;

public class Debugdemo {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.add(10, 20);
		System.out.println("the sum is--"+sum);
		
		throw new NullPointerException();
	}
}
