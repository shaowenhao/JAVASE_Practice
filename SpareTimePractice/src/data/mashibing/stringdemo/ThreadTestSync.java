package data.mashibing.stringdemo;

import java.nio.channels.NonReadableChannelException;

public class ThreadTestSync implements Runnable{
  Timer timer = new Timer();
	public static void main(String[] args) {
		
       ThreadTestSync ttSync =new ThreadTestSync();
       Thread t1=new Thread(ttSync);
       Thread t2=new Thread(ttSync);
       t1.setName("t1");
       t2.setName("t2");
       t1.start();
       t2.start();
	}

	public void run() {
		timer.add(Thread.currentThread().getName());
	}

}

class Timer{
	private static int num = 0;
	public  void add(String name) {
		synchronized (this) {
			num++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + ", you are the "+ num + " thread which use timer");
			// num++ and  Print should be consider as whole execution.
		}
		
	}
}
