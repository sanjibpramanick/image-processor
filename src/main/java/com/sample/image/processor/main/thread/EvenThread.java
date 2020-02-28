package com.sample.image.processor.main.thread;

public class EvenThread implements Runnable {

	private SharedPrinter sp;
	private int max;

	public EvenThread(SharedPrinter sp, int max) {
		super();
		this.sp = sp;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 2; i <= max; i = i + 2) {
			sp.printEvenNum(i);
		}
	}

}
