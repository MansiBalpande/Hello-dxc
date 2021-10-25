package threads.synchronization;

public class RamuThread extends Thread {
	Table mTable;
	public RamuThread(Table table) {
		mTable = table;
		
	}
	@Override
	public void run() {
		//TODO Auto-generated method stub
		super.run();
		mTable.printTable(5);
	}

}
