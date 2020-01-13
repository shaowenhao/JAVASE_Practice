package data.java8.lambda4;

public class Person {
  public String firstName;
  public String lastName;
@Override
public String toString() {
	return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
}
public Person(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
  
  
}
