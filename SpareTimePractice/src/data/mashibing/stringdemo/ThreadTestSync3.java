package data.mashibing.stringdemo;

public class ThreadTestSync3 implements Runnable{

	int b = 100;
	public synchronized void m1() {
	   b=1000;
	   try {
		Thread.sleep(5000);
		System.out.println("b="+b);
	} catch (InterruptedException e) {
		e.printStackTrace();
	 }
	}
	
	public synchronized void m2() throws Exception{ // m2 wait m1 done execute, because thread lock the object firstly 
		Thread.sleep(2500);
		b=2000;
	}
	public static void main(String[] args) throws Exception {
        ThreadTestSync3 tts3=new ThreadTestSync3();
        Thread thread= new Thread(tts3);
        thread.start();
        try {
			Thread.sleep(1000);  // make sure thread run firstly
			tts3.m2();  // main thread 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println(tts3.b);
	}

	public void run() {
		m1();		
	}

}
