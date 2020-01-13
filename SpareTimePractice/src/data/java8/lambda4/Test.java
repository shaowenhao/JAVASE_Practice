package data.java8.lambda4;

public class Test {
   
	public static void main(String[] args) {
		PersonFactory factory = new PersonFactory() {
			
			@Override
			public Person createPerson(String firstName, String lastName) {			
				return new Person(firstName,lastName);
			}
		};
		
		PersonFactory factory2 = ( firstName,  lastName)-> new Person(firstName,lastName);
		
		// easy way to use Constructor reference
		PersonFactory factory3 = Person::new;
		
		// if implemented method invoke static method like Integer.parseInt; then similar like above
		// tip:  parameters keep the same
		// XXXX = Integer::parseInt
		
		Person person = factory3.createPerson("shaowenhao", "fight");
		System.out.println(person);
		
	}

}
