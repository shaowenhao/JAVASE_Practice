package data.thread;

public class HelloThread {

	public static void main(String[] args) {
	  HelloThreadDemo thread1 = new HelloThreadDemo("Thread1");
	//  thread1.setName("thread1");
	  thread1.start();
	  HelloThreadDemo thread2 = new HelloThreadDemo("Thread2");
	//  thread2.setName("thread2");
	  thread2.start();
	}

}

class HelloThreadDemo extends Thread{
    public HelloThreadDemo(String name) {
	super(name);
}
	
	@Override
	public void run() {
	   for (int i = 0; i < 5; i++) {
		System.out.println(this.getName()+":" + i);
	 }
	}
	
}