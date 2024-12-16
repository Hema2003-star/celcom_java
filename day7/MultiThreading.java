package com.day7;

class Thread3 extends Thread{
	@Override
	public void run() {
		for(int i=1 ; i < 5 ; i++) {
			System.out.println("my thread" +Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
			break;
		}
	}
}
public class MultiThreading  {
	
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		System.out.println(t.getPriority());  //priority 5
		System.out.println(t.getName()); //name of thread
		System.out.println(t.getState()); //state
		
		System.out.println(t.getId());
		System.out.println(t.isDaemon());
		
		
		//t.stop();
//		
//		try {
//			t.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		Thread3 obj = new Thread3();
		obj.setName("thread2");
		obj.start();
		
		Thread3 obj1 = new Thread3();
		obj1.setName("thread3");
		obj1.start();
		obj1.interrupt(); //we cannot do with it because we cannot interrupt the window os

		
		System.out.println("Main end");
	//	obj.stop();
		System.out.println(obj1.isDaemon());
		
	}

}
