package data.syncronizedtest;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		BankThread t1 = new BankThread(bank);
		t1.start();    // Mo ni Bank get money
		BankThread t2 = new BankThread(bank);
		t2.start();  // Mo ni AMT get money

	}

}

class Bank{
	private int money = 500;
	
	public synchronized int getMoney(int number) {
		if(number<0) {
			return -1;
		}else if(money < 0) {
			return -2;
		}else if(number-money>0) {
			return -3;
		}else {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			money-=number;
			System.out.println("Left Money:"+money);
		}
		return number;
	}
}

class BankThread extends Thread{
	private Bank bank = null;
	public BankThread(Bank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		System.out.println("Get Money:"+ bank.getMoney(400));
	}
}