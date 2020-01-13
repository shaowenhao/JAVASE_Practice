package data.java8.defaultmethod;

public class MyInterfaceImp implements MyInterface{
  @Override
  public void defaultMethod() {

	MyInterface.super.defaultMethod();
	System.out.println("MyInterfaceImp method...");
}
  
}
