package ua.yunyk;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

	Scanner scan = new Scanner(System.in);

	public void run() {

		synchronized (System.out) {

			System.out.println("\n" + "Write your number");
			int n = Integer.parseInt(scan.next());
			int n1 = 1, n2 = 1, temp;
			for (int i = 0; i < n; i++) {
				if (i == 0) {
					System.out.print("Thread :" + n1 + ", ");
				} else if (i == 1) {
					System.out.print(n1 + ", ");
				} else {
					temp = n2;
					n2 += n1;
					n1 = temp;
					if (i == n - 1) {
						System.out.print(n2);
					} else {
						System.out.print(n2 + ", ");
					}

				}
				try {
					TimeUnit.MILLISECONDS.sleep(1000);
				} catch (InterruptedException e) {
					System.err.println(e);
				}
			}
		}
	}

}
