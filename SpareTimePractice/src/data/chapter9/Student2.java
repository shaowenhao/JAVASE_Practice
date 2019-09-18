package data.chapter9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Student{
	private  String name;
	private int id;
	
	public Student(String name,int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return (name + ":" + id);
	}
}

public class Student2 {
     
	public static void main(String[] args) {
		
      /* Student s1 = new Student("ryan", 110);
       Student s2 = new Student("Iris", 120);
       Student s3 = new Student("ryan", 110);
       Set students = new HashSet();
       students.add(s1);
       students.add(s2);
       students.add(s3);
       System.out.println(students);
       */
//		List<String> list = new ArrayList<String>();
//		list.add("a");
//		list.add("b");
//		System.out.println(list.indexOf("a"));
//		list.add(0, "c");
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		List<String> stooges = Arrays.asList("Larry", "Moe", "Curly"); 
		
  }

}
