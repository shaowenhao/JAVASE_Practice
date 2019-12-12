package data.tengxunketang;


import java.util.*;

public class TestComparable {
 public static void main(String[] args) {
	Name n1 = new Name("shao", "ryan");
	Name n2 = new Name("abc", "ryan");
	Name n3 = new Name("zzz", "def");
    List<Name> list = new ArrayList<Name>();
    list.add(n1);
    list.add(n2);
    list.add(n3);
    Collections.sort(list);
    System.out.println(list);
	
 }
}

class Name implements Comparable<Name>{
	String firstName;
	String lastNanme;
	public Name(String fName, String lName) {
		this.firstName = fName;
		this.lastNanme = lName;
	}
	
	public int compareTo(Name o) {
	  if(this.lastNanme.compareTo(o.lastNanme)!=0) {
		  return this.lastNanme.compareTo(o.lastNanme);
	  }else {
		  return this.firstName.compareTo(o.firstName);
	  }
	}
	
	@Override
	public String toString() {
		return   lastNanme + " " + firstName ;
	}
}
