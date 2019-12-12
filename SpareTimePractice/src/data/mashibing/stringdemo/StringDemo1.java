package data.mashibing.stringdemo;

import org.omg.CORBA.INTERNAL;

public class StringDemo1 {
	public static void main(String[] args) {
//      int num = 1234567;
//      String str = String.valueOf(num);
//      System.out.println(str.length()+"wei shu");
		
		String string = "abcdWERUJF123%^&";
		int upperCharNum = 0;
		int lowerCharNum = 0;
		int otherCharNum = 0;
//		
//		char[] chars = string.toCharArray();
//		for (int i = 0; i < chars.length; i++) {
//			 if(Character.isUpperCase(chars[i])){
//				upperCharNum++;
//			}else if(Character.isLowerCase(chars[i])) {
//				lowerCharNum++;
//			}else {
//				otherCharNum++;
//			}			 
//		}
//		System.out.println(upperCharNum+" " + lowerCharNum +" " +otherCharNum);
		
//		for(int i=0;i< string.length();i++) {
//			char c= string.charAt(i);
//			if(c>='a' && c<='z') {
//				lowerCharNum++;
//			}else if (c>='A' && c<='Z') {
//				upperCharNum++;
//			}else {
//				otherCharNum++;
//			}
//		}
		
		String s2="javahjavaellogoodjavausejavawillbegoodjava";
		int stringNums = 0;
		int index= -1;
		String word = "java";
		int wordLength = word.length();
		while((index=s2.indexOf(word))!=-1) {
			   // index= s2.indexOf(word);
				s2 = s2.substring(index+ wordLength);
				stringNums++;			
	
		}
		System.out.println(stringNums);
	}
}
