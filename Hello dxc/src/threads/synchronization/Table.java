package threads.synchronization;

public class Table {
	
	void printTable(int multiplier) {
		System.out.println(Thread.currentThread().getName()+"--thread is in printTable method");
		for(int i=1;i<6; i++){
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println(i*multiplier);
		}
				
	}

}
