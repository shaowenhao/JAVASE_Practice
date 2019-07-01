package data.lambda;

public class StringOrder {

	public static int byLength(String s1, String s2) {
		return s1.length() -s2.length();
	}
	
	public static int byDictionaries(String s1,String s2) {
		return s1.compareTo(s2);
	}
}
