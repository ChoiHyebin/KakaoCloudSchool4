package mycom.mytest.thread;

import java.nio.channels.InterruptedByTimeoutException;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; i++) {
			System.out.println("MyThread: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("main_thread°¡ ƒÆ¾î³³´Ï´Ù.");
			}
		}
	}
	
	
}
