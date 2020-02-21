package ua.yunyk;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RunnableThread implements Runnable {

	Scanner scan = new Scanner(System.in);

	@Override
	public void run() {
		synchronized (System.out) {
			System.out.println("\n" + "Write your number");
			int n = Integer.parseInt(scan.next());
			int n1 = 1, n2 = 1, temp;
			for (int i = 2; i < n; i++) {
				temp = n2;
				n2 += n1;
				n1 = temp;
			}

			for (int i = 0; i < n; i++) {

				if (i == 0) {
					System.out.print("Runnable: " + n2 + ", ");
				} else if (i == 1) {
					System.out.print(n1 + ", ");
				} else {
					temp = n1;
					n1 = n2 - n1;
					n2 = temp;
					if (i == n - 1) {
						System.out.print(n1);
					} else {
						System.out.print(n1 + ", ");
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
