package com.sample.image.processor.main.thread;

public class ThreadRunner {

	public static void main(String[] args) {

		SharedPrinter sp = new SharedPrinter();
		Thread odd = new Thread(new OddThread(sp, 10), "Odd");
		Thread even = new Thread(new EvenThread(sp, 10), "Even");
		odd.start();
		even.start();
		
		Printer print = new Printer();
	    Thread t1 = new Thread(new TaskEvenOdd(10, print, false),"Odd");
	    Thread t2 = new Thread(new TaskEvenOdd(10, print, true),"Even");
	    t1.start();
	    t2.start();
	}

}
