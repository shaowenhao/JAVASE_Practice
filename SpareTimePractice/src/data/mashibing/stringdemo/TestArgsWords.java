package data.mashibing.stringdemo;

import java.util.HashMap;
import java.util.Map;


public class TestArgsWords {
	private  static int times = 1;
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<args.length;i++) {
        	if (map.get(args[i])==null) {
				map.put(args[i], times);
			}else {
				map.put(args[i], times+1);
			}
        }
        System.out.println("found"+ map.size()+" words");
       System.out.println(map);
	}

}
