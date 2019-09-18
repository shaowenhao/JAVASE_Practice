package data.syncronizedtest;

import java.util.LinkedList;

public class ProductorConsumerDemo {

	public static void main(String[] args) {
       Basket basket = new Basket();
       Productor productor = new Productor(basket);
       Consumer consumer = new Consumer(basket);
       productor.start();
       consumer.start(); 
	}

}


class Apple{
	private int id;
	public Apple(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
     return "Apple:"+ (id+1);
	}
}

class Basket{
	private LinkedList<Apple> list = new LinkedList<Apple>();
	
	public synchronized void pushApple() {
		for (int i = 0; i < 20; i++) {
			Apple apple = new Apple(i);
			push(apple);
		}
	}

	public synchronized void popApple() {
		for (int i = 0; i < 20; i++) {
			pop();
		}
	}
	
	private void push(Apple apple) {
		if (list.size()==5) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.addFirst(apple);
        System.out.println("Push"+ apple.toString());
        notify();
	}
	
	private void pop() {
		if (list.size()==0) {
			try {
				wait();
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Apple apple = list.removeFirst();
        System.out.println("Eat"+ apple.toString());
        notify();
	}
}


class Productor extends Thread{
	private Basket basket = null;

	public Productor(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
     basket.pushApple();
	}
}

class Consumer extends Thread{
	private Basket basket = null;

	public Consumer(Basket basket) {
		super();
		this.basket = basket;
	}
	
	@Override
	public void run() {
     basket.popApple();
	}
}