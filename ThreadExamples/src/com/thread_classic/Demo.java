package com.thread_classic;

public class Demo {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		MyClass class1 = new MyClass();

		myClass.start();
		class1.start();

	}

}
