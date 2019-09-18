package data.syncronizedtest;

// Nested synchronized 
public class DieThreadDemo {

	public static void main(String[] args) {
		Example example= new Example();
		DieThread1 thread1 = new DieThread1(example);
		thread1.start();
		DieThread2 thread2 = new DieThread2(example);
		thread2.start();
	}

}


class Example{
	private Object obj1 = new Object();
	private Object obj2 = new Object();
	
	public void method1() {
		synchronized (obj1) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj2) {
				System.out.println("Method1");
			}
		}
		
	}
	
	public void method2() {
		synchronized (obj2) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (obj1) {
				System.out.println("Method2");
			}
		}
	
	}
}

class DieThread1 extends Thread{
	private Example example = null;

	public DieThread1(Example example) {
		super();
		this.example = example;
	}
	
	@Override
	public void run() {
		example.method1();
	}
}
class DieThread2 extends Thread{
		private Example example = null;

		public DieThread2(Example example) {
			super();
			this.example = example;
		}
		
		@Override
		public void run() {
			example.method2();
		}
}
