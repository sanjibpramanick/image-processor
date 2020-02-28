package com.sample.image.processor.main.thread;

public class OddThread implements Runnable {

	private SharedPrinter sp;
	private int max;

	public OddThread(SharedPrinter sp, int max) {
		super();
		this.sp = sp;
		this.max = max;
	}

	@Override
	public void run() {
		for (int i = 1; i <= max; i = i + 2) {
			sp.printOddNum(i);
		}
	}

}
