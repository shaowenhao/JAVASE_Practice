package data.mashibing.stringdemo;

public class ThreadTestSync2 implements Runnable{

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
	
	public void m2() {
		System.out.println("b="+b);
	}
	public static void main(String[] args) {
        ThreadTestSync2 tts2=new ThreadTestSync2();
        Thread thread= new Thread(tts2);
        thread.start();
        try {
			Thread.sleep(1000);  // make sure thread run firstly
			tts2.m2();  // main thread 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
	}

	public void run() {
		m1();		
	}

}
