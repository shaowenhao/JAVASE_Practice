package data.recursive;

public class TestHanoi {

	public static void main(String[] args) {
		
     hanoi(3, 'A', 'B', 'C');
	}
 
	
	
	public static void hanoi(int n, char from, char in, char to) {
		if (n==1) {
			System.out.println("Di yige panzi cong"+from+"yi dao"+to);
		}else {
			hanoi(n-1, from, to, in);
			System.out.println("Di" + n +"ge pan zi cong"+ from +"di dong" + to);
			hanoi(n-1, in, from, to);
		}
	}
	

}