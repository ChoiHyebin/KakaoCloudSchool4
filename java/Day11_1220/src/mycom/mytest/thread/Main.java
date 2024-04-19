package mycom.mytest.thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new MyThread());
		thread.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("main_thread: " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("main_thread°¡ ±ú¾î³³´Ï´Ù.");
			}
		}
	}

}
