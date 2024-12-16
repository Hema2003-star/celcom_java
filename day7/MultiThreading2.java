package com.day7;

	class Thread4 extends Thread {
		
	@Override
	public void run() {
		for(int i=1 ; i < 5 ; i++) {
			System.out.println("my thread" +Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
			}
			
		}
	}
	}


		public class MultiThreading2  {
		
			public static void main(String[] args) {
				Thread4 t = new Thread4();
				System.out.println(t);
				t.setName("hema");
				t.start();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
				}
				try {
					t.wait();  //here we dont have suspend and resume
				}catch(UnsupportedOperationException e) {
					
				} catch (InterruptedException e) {
					
					//e.printStackTrace();
				}
				
			    		    
			    System.out.println(t.getState());
			    
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
				}
				
				try {
					t.notifyAll();
				}catch(UnsupportedOperationException e) {
					
				}
				
				
				
				
				
				
			}

		}

