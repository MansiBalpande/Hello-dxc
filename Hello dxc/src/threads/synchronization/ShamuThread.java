package threads.synchronization;

public class ShamuThread extends Thread {
	Table mTable;
	public ShamuThread(Table table) {
		mTable = table;
		
	}
	@Override
	public void run() {
		//TODO Auto-generated method stub
		super.run();
		mTable.printTable(5);
}}
