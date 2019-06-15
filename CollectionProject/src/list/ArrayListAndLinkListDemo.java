package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ArrayListAndLinkListDemo {

	public static void main(String[] args) {
		System.out.println("ArrayList cost time:" + costTime(new ArrayList<>()));
		System.out.println("LinkedList cost time:" + costTime(new LinkedList()));
	}
	
	public static long costTime(List<Object> list) {
		final int num =150000;
		Object obj  = new Object();
		long startTime = System.currentTimeMillis();
		for(int i=0; i<num;i++) {
			//list.add(0, obj);
			list.add(obj);
		}		
		long endTime = System.currentTimeMillis();
		return endTime -startTime;
	}

}
