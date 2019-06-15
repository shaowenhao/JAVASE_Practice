package mappg;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
  private static Set<Entry<String, Integer>> entrySet;

public static void main(String[] args) {
	
	  //mapBasicMethod();
	  mapeErgodic();
  }
  
  
  public static void mapBasicMethod() {
	  HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
	  hashMap.put("LuFei", 16);
	  hashMap.put("Zoro", 19);
	  hashMap.put("Sanzi", 15);
	  hashMap.put("NaMei", 17);
	  
	  System.out.println("Hash Mp:" + hashMap);
	  
	  LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
	  linkedHashMap.put("LuFei", 16);
	  linkedHashMap.put("Zoro", 19);
	  linkedHashMap.put("Sanzi", 15);
	  linkedHashMap.put("NaMei", 17);
	  
	  System.out.println("Linked Hash Mp:" + linkedHashMap);
	  
	  TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>(new MapComparatorByValue(linkedHashMap));
//	  treeMap.put("LuFei", 16);
//	  treeMap.put("Zoro", 19);
//	  treeMap.put("Sanzi", 15);
//	  treeMap.put("NaMei", 17);
	  treeMap.putAll(linkedHashMap);
	  // by default order by key
	  System.out.println("Tree Mp:" + treeMap);
	  
	   }
  
    public static void mapeErgodic() {
    	  HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
    	  hashMap.put("LuFei", 16);
    	  hashMap.put("Zoro", 19);
    	  hashMap.put("Sanzi", 15);
    	  hashMap.put("NaMei", 17);
    	  
    	  Set<String> keySet = hashMap.keySet();
    	  for(String key: keySet) {
    		  System.out.println("Map's key" + key +"\tMap's value" + hashMap.get(key));
    	  }
    	  
    	  Set<Entry<String, Integer>>  entrySet = hashMap.entrySet(); 
    	  for(Entry<String, Integer> entry: entrySet) {
    		  System.out.println(entry.getKey()+"--"+entry.getValue());
    	  }
    }
  
}

class MapComparatorByValue implements Comparator<String> {
    private Map<String, Integer> map = null; 
    MapComparatorByValue(Map< String, Integer> map){
    	this.map = map;
    }
	@Override
	public int compare(String key1, String key2) {
		if(map.get(key1) > map.get(key2)) return 1;
		if(map.get(key1) < map.get(key2)) return -1;
		return 0;
	}
	
}
