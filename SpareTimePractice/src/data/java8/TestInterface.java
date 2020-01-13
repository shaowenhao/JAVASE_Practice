package data.java8;

@FunctionalInterface
public interface TestInterface {
    void test();
    public static void test2() {
    	System.out.println("static method in interface");
	} 
    
}
