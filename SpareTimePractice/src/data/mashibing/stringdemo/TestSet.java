package data.mashibing.stringdemo;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
        Set<String>  s2 = new HashSet<String>();
        s1.add("a");
        s1.add("c");
        s1.add("b");
        s2.add("e");
        s2.add("f");
        s2.add("c");
        Set<String> sn = new HashSet<String>(s1);
        sn.retainAll(s2);
        System.out.println(sn);
	}

}
