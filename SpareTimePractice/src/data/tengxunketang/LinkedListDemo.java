package data.tengxunketang;

import java.util.Iterator;
import java.util.LinkedList;

// LinkedList implement Stack/Queue
public class LinkedListDemo {

	public static void main(String[] args) {
	  MyStack<String> myStack = new MyStack();
	  myStack.push("aa");
	  myStack.push("bb");
	  myStack.push("cc");
	  myStack.pop();
	  
	  Iterator<String> iterator = myStack.iterator();
      while(iterator.hasNext()) {
    	  System.out.println(iterator.next());
      }
	}

}

class MyStack<T> {
	private LinkedList<T> data =null;
	public MyStack() {
		data= new LinkedList<T>();
	}
	
	public void push(T obj) {
		data.addFirst(obj);
	}
	
	public T pop() {
		return data.removeFirst();
	}
	
	public Iterator<T> iterator(){
		return data.iterator();
	}
		
	
}