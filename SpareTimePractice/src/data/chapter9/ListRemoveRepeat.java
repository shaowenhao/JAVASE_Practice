package data.chapter9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListRemoveRepeat {

	public static void main(String[] args) {
		List<Integer> L1 =new ArrayList<Integer>();
		L1.add(1);
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(2);
		 List<Integer> newList = ListRemoveRepeat.removeRepeat(L1);
for (int i : newList) {
	System.out.println(i);
}

	}

	public static List<Integer> removeRepeat(List<Integer> list) {
		List<Integer> tmp = new ArrayList<Integer>();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			int a =(int) iterator.next();
			if(tmp.contains(a)) {
				iterator.remove();
			}else {
				tmp.add(a);
			}
		}
		
        for (int i : list) {
			System.out.println(i+",");
		}
		return tmp;
	}
}
