package com.thread_synchronized_join;

public class Demolast {
	private static int count = 0;
	
	public static synchronized void countMyNumber(){
		count++;
	}
	
	public static void main(String[] args) {
		
		Thread threadOne = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					countMyNumber();
					//count++;
				}
			}
		});
		
		//***********************************************
		
		Thread threadTwo = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 1000; i++) {
					countMyNumber();
					//count++;
				}
			}
		});
		try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		System.out.println("Value of : "+count);
	}

}

