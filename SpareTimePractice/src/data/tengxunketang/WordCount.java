package data.tengxunketang;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WordCount {

	public static void main(String[] args) {
		String[] datas= {"aa","bb","cc","aa"};		
         Map<String, Integer> map = AccountUtil.accountWords(datas);
         AccountUtil.printAccount(map);
	}

}

class AccountUtil{
	public static Map<String, Integer> accountWords(String[] datas){
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < datas.length; i++) {
			if (map.get(datas[i])==null) {
				map.put(datas[i], 1);
			}else {
				map.put(datas[i], map.get(datas[i])+1);
			}		
		}
		return map;
	}
	
	public static void printAccount(Map<String, Integer> map) {
		Set<Entry<String, Integer>> entrys = map.entrySet();
		for (Entry<String, Integer> entry : entrys) {
			System.out.println(entry.getKey()+"chuxian "+entry.getValue()+" time");
		}
	}
}
