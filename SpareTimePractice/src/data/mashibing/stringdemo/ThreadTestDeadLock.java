package data.mashibing.stringdemo;


public class ThreadTestDeadLock implements Runnable{
    public int flag = 1;
    public static Object o1 = new Object(); // static use is important
    public static  Object o2=new Object();
	
    
	public static void main(String[] args) {
         ThreadTestDeadLock ttdl= new ThreadTestDeadLock();
         ThreadTestDeadLock ttdl2 = new ThreadTestDeadLock();
         ttdl.flag =1;
         ttdl2.flag=0;
         Thread t1 = new Thread(ttdl);
         Thread t2 = new Thread(ttdl2);
         t1.start();
         t2.start();
         
	}


	public void run() {
      if(flag==1) {
    	  synchronized (o1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (o2) {
				System.out.println("flag=" + flag);
			}
		}

      }
      if (flag==0) {
		synchronized (o2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (o1) {
				System.out.println("Flag="+flag);
			}
		 }
		}

		
	}

}
