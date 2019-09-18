package data.reflection;

public class ClassDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// 1 object name.getClass()
		Employee employee = new Employee("Ryan", 31); //data.reflection.Employee
		Class<?> classType = employee.getClass();
		System.out.println(classType.getName());
		
		// class name.class
		Class<?> classType2 = Employee.class;
		System.out.println(classType2.getName()); //data.reflection.Employee
  
		// Class.forName()
		Class<?> classType3 = Class.forName("data.reflection.Employee"); //data.reflection.Employee
		System.out.println(classType3.getName());
		
		Class<?> classType4 = int.class;
		System.out.println(classType4.getName()); //int
		
		Class<?> classType5 = Double.TYPE;     //double
		System.out.println(classType5.getName());
		
		Class<?> classType6 = Double.class;     //java.lang.Double
		System.out.println(classType6.getName());
	}

}

class Employee{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}