package data.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectAPIDemo {

	public static void main(String[] args) throws Exception {
		Class<?> classType = Class.forName("data.reflection.Employee2");
//        try {
//			Employee2 emp1 = (Employee2)classType.newInstance();
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		}

		try {
			Constructor<?> constructor = classType.getConstructor(new Class[] { String.class, int.class });
			Employee2 newInstance = (Employee2) constructor.newInstance(new Object[] { "shaowenhao", 31 });
			System.out.println(newInstance);
			Method method = classType.getDeclaredMethod("toString", new Class[] {});
			System.out.println(method);
			String str = (String)method.invoke(newInstance, new Object[] {});
			System.out.println(str);
			
			Method method2 = classType.getDeclaredMethod("working", new Class[] {});
			method2.setAccessible(true);
			method2.invoke(newInstance, new Object[] {});			
			Field field = classType.getDeclaredField("name");
			field.setAccessible(true);
			field.set(newInstance, "xiaodan");
			
		System.out.println(field.get(newInstance));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
    
	
}

class Employee2 {
	private String name;
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

	public Employee2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Employee2() {
		System.out.println("wu can gouzhao!!");
	}

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + "]";
	}
	private void working() {
		System.out.println("working");
	}

}