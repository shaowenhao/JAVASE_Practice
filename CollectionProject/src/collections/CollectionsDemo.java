package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		List<Integer> collection = new ArrayList<Integer>();
		 collection.add(123);
		 collection.add(120);
		 collection.add(124); 
		 collection.add(127);
		 collection.add(123);
		 
		 collection.forEach(value -> System.out.print(value+ ","));
         Collections.shuffle(collection);
         System.out.println("element in collection occure times:" + Collections.frequency(collection, 123));
	
	 //supplement
         
         List<String> asList = Arrays.asList("asd","edf");
         asList.add("def"); // asList size was fixed!!
	}

}
