package com.day7;

// 2nd way of creating thread
class Thread6 implements Runnable {
	
	@Override
	public void run() {
		for(int i=1 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}			
		}
	}
	}
public class MultiThread4 {
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread6());
		t1.setName("t1");	
		t1.start();
		
		System.out.println("Main End");
		
		
		
		
	}

}
