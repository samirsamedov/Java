package com.thread_runnable;

public class Demo2 {

	public static void main(String[] args) {

		Thread t1 = new Thread(new MyOtherclass());
		Thread t2 = new Thread(new MyOtherclass());
		
		t1.start();
		t2.start();
	}

}
