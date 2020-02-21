package ua.yunyk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main2 {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new MyThread());
		exec.execute(new RunnableThread());
		exec.shutdown();
		
		ExecutorService exec2 = Executors.newSingleThreadExecutor();
		exec2.execute(new MyThread());
		exec2.execute(new RunnableThread());
		exec2.shutdown();
		
		ExecutorService exec3 = Executors.newFixedThreadPool(2);
		exec3.execute(new MyThread());
		exec3.execute(new RunnableThread());
		exec3.shutdown();
	}
}
