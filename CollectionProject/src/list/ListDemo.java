package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ryan");
		list.add("shao");		
		System.out.println(list);
		
		Iterator<String> iterator= list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ,");
		}
        System.out.println();
  	  for(int i=0;i<list.size();i++) {
  		  System.out.print(list.get(i)+ " ,");
  	  }
  	    System.out.println();
  	 for (String elm : list) {
  		 System.out.print(elm + " ,");
  	 }
  	  
  	     System.out.println(); 
  	     
  	     ListIterator<String> listIterator = list.listIterator(list.size());
  	     while(listIterator.hasPrevious()) {
  	    	 System.out.print(listIterator.previous()+ " ,");
  	     }
  	     System.out.println();
  	     
  	   ListIterator<String> listIterator2 = list.listIterator(1);
  	   if(listIterator2.hasPrevious()) {
  		   listIterator2.previous();
  		   listIterator2.set("wenhao");
  	   }
  	   System.out.print(list);
	}


}
