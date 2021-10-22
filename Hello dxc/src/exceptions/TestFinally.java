package exceptions;

public class TestFinally {
	
	public static void main(Strings[] args) {
		
		try {
			int data = 25/0;  //an exception is thrown -- making a call
			System.out.println("the data is "+data);
			
		}catch (Exception e) {
			//catch block is like receiving the call when exception occurs 
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block got excuted");
		}
		
	}

}
