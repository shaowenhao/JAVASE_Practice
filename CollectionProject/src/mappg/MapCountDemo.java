package mappg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapCountDemo {
  // count in file how many time the key words appears
	 
	public static void main(String[] args) {
		final String fileNameString = "src/mappg/MapCountDemo.java";
        List<String> contentList = readFile(fileNameString);      
        countKeyWord(contentList);
	}

	public static void countKeyWord(List<String> contentList) {
		final String keyWords = "import,static,static,public,int";
        
	    Set<String> keyWordSet = new HashSet<String>(Arrays.asList(keyWords.split(",")));
	    Map<String, Integer> keyWordsMap = new HashMap<String, Integer>();
		for(String keyWord: keyWordSet) {
			keyWord = keyWord.trim(); 
			for(String line : contentList) {
				// each line has how many keyword need an method
				int count = getLineKeyWordCount(line, keyWord);
				if(count ==0) continue;
				if(keyWordsMap.containsKey(keyWord)) {
					int oldCount = keyWordsMap.get(keyWord).intValue();
				    keyWordsMap.put(keyWord, new Integer(count+oldCount));
				}else {
					keyWordsMap.put(keyWord, count); // keyword appear first time add directlly
				}
			}
		}
		
		for(Entry<String, Integer> entry: keyWordsMap.entrySet()) {
			System.out.println(entry.getKey()+ "==" + entry.getValue());
		}
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(new MapComparatorByValue(keyWordsMap));
		treeMap.putAll(keyWordsMap);
		for(Entry<String, Integer> entry: treeMap.entrySet()) {
			System.out.println(entry.getKey()+ "==" + entry.getValue());
		}
	}
	
	public static int getLineKeyWordCount(String line, String keyWord) {
		if(null==line || line.length()==0) return 0;
		
		if(line.startsWith("/**") || line.startsWith("*") || line.startsWith("*/") || line.startsWith("//")) {
			return 0;
		}			
		int count =0;
		String strLine =new String(line);
		int index = -1;
		
		while((index = strLine.indexOf(keyWord)) != -1) {
			count++;
			strLine = strLine.substring(index + keyWord.length()); 
		}
		
		return count;
	}
	
	private static List<String> readFile(String fileName) {
		List<String> contentList = new ArrayList<String>();
		try(  FileReader fReader = new FileReader(fileName);
			  BufferedReader bReader = new BufferedReader(fReader);
				) {
			 String line = null;
			 while((line=bReader.readLine()) !=null) {
				 contentList.add(line.trim());
			 }
		} catch (Exception e) {
			
		}
		return  contentList;
		
	}
}
