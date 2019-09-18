package data.thread;

public class HelloRunnable {

	public static void main(String[] args) {
		HelloRunnableDemo hrd = new HelloRunnableDemo();
        Thread t1 = new Thread(hrd,"T1");
        t1.start();
        Thread t2 = new Thread(hrd,"T2");
        t2 .start();
        
	}

}


class HelloRunnableDemo implements Runnable{

	@Override
	public void run() {
		 for (int i = 0; i < 5; i++) {
				System.out.println( Thread.currentThread().getName()+":" + i);
			 }
	}
	
}