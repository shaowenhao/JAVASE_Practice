package data.java8.lambda3;

public class Test {

	public static void main(String[] args) {
       
		MyInterface mi1 = new MyInterface() {			
			@Override
			public void print(String str1) {
				System.out.println(str1);				
			}
		};
		mi1.print("hello lambda");
		
		MyInterface mi2 = (String str1) ->{
			System.out.println(str1);				
		};
		
		// only one parameter () can remove
		MyInterface mi4 = str1 ->System.out.println(str1);
		mi4.print("hello lambda2");
 }

}
