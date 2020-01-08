package data.mashibing.stringdemo;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("a", 1);
		m1.put("b", 2);
		System.out.println(m1.size());
        System.out.println(m1.containsKey("a"));
        System.out.println(m1.containsValue(1));
        int i = m1.get("a");
        System.out.println(i);
	}

}
