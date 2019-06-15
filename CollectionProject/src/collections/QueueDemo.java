package collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import org.omg.CORBA.portable.ValueBase;

public class QueueDemo {
  public static void main(String[] args) {
//	  Queue<String> queue = new LinkedList<>();
//	  queue.offer("Ryan");
//	  queue.offer("Shao");
//	  queue.offer("Wen");
//	  queue.offer("Hao");
//	  
//	  System.out.println("out queue operation:" + queue.poll());
//	  queue.forEach(value -> System.out.println(value + ","));
	  ArrayDqueueDemo();
   }
  
  // it can used as queue and also used as stack (Shuang Duan queue)
  //as Stack use push and pop
  public static void ArrayDqueueDemo() {
	  ArrayDeque<String> arrayDQueue = new ArrayDeque<String>();
	  arrayDQueue.push("Ryan");
	  arrayDQueue.push("Shao");
	  arrayDQueue.push("Wen");
	  arrayDQueue.push("Hao");
	  System.out.println("push into stack  ");
	  arrayDQueue.forEach(value -> System.out.println(value + ","));
	  
      System.out.println("pop out stack " + arrayDQueue.pop());
	  arrayDQueue.forEach(value -> System.out.println(value + ","));
	  
	  // 
  }
}
