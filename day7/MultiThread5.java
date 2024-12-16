package com.day7;

class TwoTable implements Runnable {
	
	@Override
	public void run() {
		for(int i=1 ; i <= 10 ; i++) {
			System.out.println(i + " * 2 = " +(i*2));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}			
		}
	}
	}

class FiveTable extends Thread {
	
	@Override
	public void run() {
		for(int i=1 ; i <= 10 ; i++) {
			System.err.println(i + " * 5 = " +(i*5));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}			
		}
	}
	}
public class MultiThread5 {
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new TwoTable());
		t.start();
		
		t.join();
		
		FiveTable t1 = new FiveTable();
		t1.start();
		
		
	}

}
