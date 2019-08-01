package data.chapter9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Guest {

	public static void main(String[] args) {
        List names = new ArrayList();
        collectName(names);
        System.out.println("Custoer Upper List:");
        printUpperCase(names);   
        System.out.println("Custoer Lower List:");
        printLowerCase(names); 
	}

	public static void collectName(List names) {
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.print("Customer name:");
		 String name =input.nextLine();
		 if(name.equals("quit")) {
			 break;
		  }
		  names.add(name);
		}
	}
	
	static void printUpperCase(List names) {
		for (int i = 0; i < names.size(); i++) {
			 String name=(String)names.get(i);
			 System.out.println(name.toUpperCase());
		}
	}
	
	static void printLowerCase(List names) {
		for (Object object : names) {
			String name=(String)object;
			System.out.println(name.toLowerCase());
		}
	}
	
}

