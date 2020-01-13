package data.java8.lambda2;

public class Test {

	public static void main(String[] args) {
       
		//Anonymous Inner Class
       MyInterface mi = new MyInterface() {
    		@Override
    		public int add(int num1, int num2) {		
    			return num1 + num2;
    		}

    	};
    	
    	// Lambda expression normal
    	MyInterface mi2 = (int num1, int num2) ->{		
			return num1 + num2;
		};
    			
    	// can not write type
		MyInterface mi3 = ( num1,  num2) ->{		
			return num1 + num2;
		};
		
    	// if only one line code in the method, it can ignore {} and if the code is return it can remove
		
		MyInterface mi4 = ( num1,  num2) ->	 num1 + num2;
		
		
   System.out.println(mi.add(100, 200));
   System.out.println(mi4.add(100, 200));
 }

}
