package data.mashibing.stringdemo;

public class TestThreadJoin {

	public static void main(String[] args) {
		Runner3 runner3 = new Runner3("ThreadTestJoin");
		runner3.start();
		try {
			runner3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("I am main thread");
		}
	}

}

class Runner3 extends Thread{
	public Runner3(String s) {
		super(s);
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			//System.out.println("Runner1"+this.getName()+i);
			System.out.println(Thread.currentThread().getName()+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
			
		}
	}
}
