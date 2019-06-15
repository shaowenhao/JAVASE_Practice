package setdemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//HashSetDemo();
		//LinkedHashSetDemo();
		TreeSetDemo();
	}
	
	// no duplicate element,  no order
	public static void HashSetDemo() {
		Set<String> citySet = new HashSet<String>();
		citySet.add("London");
		citySet.add("BeiJing");
		citySet.add("ShangHai");
		citySet.add("ShangHai");
		citySet.forEach(str -> System.out.print(str + ","));
	}
	
	// input order same as actually order
	public static void LinkedHashSetDemo() {
		Set<String> citySet = new LinkedHashSet();
		citySet.add("London");
		citySet.add("BeiJing");
		citySet.add("ShangHai");
		citySet.forEach(str -> System.out.print(str + ","));
	}
	
	
	public static void TreeSetDemo() {
		TreeSet<String> citySet = new TreeSet<String>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.compareTo(o2) > 0) return -1;
				if(o1.compareTo(o2) < 0) return 1;
				return 0;
			}
		});
		citySet.add("London");
		citySet.add("BeiJing");
		citySet.add("ShangHai");
		citySet.forEach(str -> System.out.print(str + ","));
		System.out.println("remove first element:"+citySet.pollFirst() );
		citySet.forEach(str -> System.out.print(str + ","));
	}
	
}
