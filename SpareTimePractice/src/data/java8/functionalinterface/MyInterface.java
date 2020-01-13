package data.java8.functionalinterface;

// this is an functional interface
@FunctionalInterface
public interface MyInterface {
   void test();
   static void test1() {}
   default void test2() {}
   
}