package data.recursive;

public class TestFebonacci {

	public static void main(String[] args) {
		int i = febonacci(7);
		// 1 1 2 3 5 8 13
		System.out.println(i);
	
	}
	
	public static int febonacci(int i) {
		if(i==1 || i ==2) {
			return 1;
		}else {
			return febonacci(i-1)+ febonacci(i-2);
		}
	}

}
