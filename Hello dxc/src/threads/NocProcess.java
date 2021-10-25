package threads;

public class NocProcess {
	
	public static void main(String[] args) {
		//oldSequentialWay();
		
		FeeThread feeThread = new FeeThread();
		feeThread.start();
	}
	
	private static void oldSequentialWay() {
		try {
			//fee
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//hostel
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//transport
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
			//library
			Thread.sleep(500);
			System.out.println("got the fee no due stamp");
		}
		catch (Exception e) {
		
	}
	}
}
