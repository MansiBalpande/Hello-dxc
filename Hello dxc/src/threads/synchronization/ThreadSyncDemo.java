package threads.synchronization;

public class ThreadSyncDemo {
	public static void main(String[] args) {
		Table table = new Table(); //common object for both the threads
		
		ShamuThread shamuThread = new ShamuThread(table);
		RamuThread ramuThread = new RamuThread(table);
		
		shamuThread.start();
		ramuThread.start();
		
	}

}
