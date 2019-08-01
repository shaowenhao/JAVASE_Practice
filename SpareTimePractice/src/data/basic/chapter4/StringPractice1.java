package data.basic.chapter4;

public class StringPractice1 {

	public static void main(String[] args) {
	   String name = "Ryan Shao";
       System.out.println(name.length());
       System.out.println(name.charAt(0)); 
       System.out.println(name.charAt(name.length()-1));
       
       char[] cs = {'j','u','s','t'};
       String name2 = new String(cs);
       System.out.println(name2);
       
       char[] charArray = name2.toCharArray();
       String value1 = String.valueOf(charArray);
       System.out.println(value1);
       
       String num = "1234";
       int n1 = Integer.parseInt(num);
       System.out.println("Total num:"+ (n1+1000));
	}

}
