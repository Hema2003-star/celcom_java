package com.day7;

class Thread5 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class MultiThread3 {
	public static void main(String[] args) throws InterruptedException {
		Thread5 t = new Thread5();
		t.setName("t1");
		t.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		t.join();

		System.out.println("Main end");

	}

}
