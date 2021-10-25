package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadPool {
	public static void main(String[] args) {
		//hiring 5 people
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		for(int i=0; i<10; i++) {
			Runnable worker = new WorkerThread("job no "+i);
			executorService.execute(worker);
		}

		executorService.shutdown();
	}

}
