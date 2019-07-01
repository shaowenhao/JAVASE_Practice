package data.lambda;

import java.util.Arrays;

public class StringOrderDemo {

	public static void main(String[] args) {
		String[] names = {"aaaa","bb","ccc"};
		Arrays.sort(names, (name1,name2)->StringOrder.byLength(name1, name2));
        System.out.println(Arrays.toString(names));
        
        //method reference
        Arrays.sort(names, StringOrder::byLength);
        
        Arrays.sort(names, StringOrder::byDictionaries);
        System.out.println(Arrays.toString(names));
        
        Arrays.sort(names, String::compareTo);
        System.out.println(Arrays.toString(names));
        
	}

}
