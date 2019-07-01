package data.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class BasicLambda {
	public static void main(String[] args) {
		String[] names = {"Ryan","DuXiaoDan","wenhao"};
//	Arrays.sort(names, new Comparator<String>() {
//			@Override
//			public int compare(String name1, String name2) {
//				// TODO Auto-generated method stub
//				return name1.length() - name2.length();
//			}
//
//		});

//		Comparator<String> cop = new Comparator<String>() {
//			@Override
//			public int compare(String name1, String name2) {
//				return name1.length() - name2.length();
//			}
//		}
//		Arrays.sort(names, cop);
  
		//(String name1,String name2) -> (name1,name2)
		Comparator<String> byLength = (name1, name2) -> {
			return name1.length() -name2.length();
		};
		System.out.println("=========");
		//Arrays.sort(names, byLength);
		Arrays.sort(names, (name1,name2)->name1.length()-name2.length());
		System.out.println(Arrays.toString(names));
	}
   
		
}
