package ua.yunyk;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.start();
		
		Thread t = new Thread(new RunnableThread());
		t.start();
		
	}
}
