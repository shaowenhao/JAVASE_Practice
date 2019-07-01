package data.orginization;

public class MyStack {

	//Stack use array to implement
   int[] elements;
   
   public MyStack() {
	elements = new int[0];
   }   
   
   public void push(int element) {
	   int[] newArray = new int[elements.length+1];
	   
	   for (int i = 0; i < elements.length; i++) {
		newArray[i] = elements[i];		
	  }
	   newArray[elements.length] = element;
	   elements = newArray;
   }
   
   // move out top element
   public int pop() {
	   if (elements.length == 0) {
		throw new RuntimeException("stack it empty");
	}
	   int element = elements[elements.length-1];	 
	   
	   int[] newArry = new int[elements.length-1];
	   
	   for (int i = 0; i < elements.length-1; i++) {
		newArry[i] = elements[i];
	}
	   elements = newArry;
	   return element;
   }
   
   // check  top element
   public int peek(){
	   return elements[elements.length-1];
   }
   
   public boolean isEmpty() {
	   return elements.length == 0;
   }
  }
