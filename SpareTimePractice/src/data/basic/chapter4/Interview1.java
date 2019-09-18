package data.basic.chapter4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Interview1 {
  public static void main(String[] args) {
	  
	 String data = "a,b,c";
	 String[] datas  = data.split(",");
//	 for (int i = 0; i < datas.length; i++) {
//		System.out.println(datas[i]);
//	}
	 System.out.println(Arrays.toString(datas));
	 
//	 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
//	 int count = 0;
//	 for(int i=0;i<my_array.length;i++) {
//		 for(int j=i+1;j<my_array.length;j++) {
//			 if(my_array[i] == my_array[j]) {
//				 count++;
//			 }
//		 }
//		 if(count==1) {
//			 System.out.println(my_array[i]);
//		 }
//		 count = 0;
//	 }
	 
//	 String[] a1 = {"a","b","c"};
//	 String[] a2 = {"c","d","e"};
//	 String[] union = Interview1.union(a1, a2);
//	 for (int i = 0; i < union.length; i++) {
//		System.out.println(union[i]);
//	}
	 
//	  String[] a3 = {"a","b","c"};
//	  System.out.println(Interview1.arrayToString(a3));
 }
  
  public static String[] union(String[] arry1, String[] arry2) {
	  Set<String> my_set = new HashSet<String>();
	  
	  for(String data: arry1) {
		  my_set.add(data);
	  }
	  
	  for(String data2: arry2) {
		  my_set.add(data2);
	  }
	  
	 //java.lang.Object; cannot be cast to [Ljava.lang.String
	 // String[] array = (String[]) my_set.toArray();
	  String[] result = {};
	  String[] arrayResult = my_set.toArray(new String[0]);
	  return arrayResult;
  }
  
  
  public static  String arrayToString(String[] strs) {
	  StringBuilder sb = new StringBuilder();
	  for(String str: strs) {
		  sb.append(str);
	  }
	 return sb.toString();
	 }
}
