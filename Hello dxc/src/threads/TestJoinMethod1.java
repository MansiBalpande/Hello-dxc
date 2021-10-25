package threads;

public class TestJoinMethod1 extends Thread{
	public void run() {
		//System.out.println(Thread.currentThread().getName());
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {System.out.println(e);}
			System.out.println(i+"--"+Thread.currentThread().getName());
			
			}
		
		}
	public static void main(String[] args) {
		TestJoinMethod1 t1=new TestJoinMethod1();
		t1.setName("first Thread");
		TestJoinMethod1 t2=new TestJoinMethod1();
		t2.setName("second Thread");
		
		TestJoinMethod1 t3=new TestJoinMethod1();
		t3.setName("third Thread");
		
		t1.start();
		try {
			t1.join();
		}catch(Exception e) {System.out.println(e);}
		
		t2.start();
		t3.start();
		
	}
	}


