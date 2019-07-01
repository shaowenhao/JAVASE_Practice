package data.orginization;

public class MyQueue {

	int[] elements;
	
	public MyQueue() {
		elements = new int[0];
	}
	
	   public void add(int element) {
		   int[] newArray = new int[elements.length+1];
		   
		   for (int i = 0; i < elements.length; i++) {
			newArray[i] = elements[i];		
		  }
		   newArray[elements.length] = element;
		   elements = newArray;
	   }
	
	public int poll() {
		int element = elements[0];
		int[] newArry = new int[elements.length-1];
		 for (int i = 0; i < newArry.length; i++) {
			newArry[i] = elements[i+1];
		}
		 elements = newArry;
		 return element;
	}
}
