package data.mashibing.stringdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Transform2 {

	public static void main(String[] args) {
	 InputStreamReader isr= new InputStreamReader(System.in);
	 BufferedReader br= new BufferedReader(isr);
	 String str = null;
	 try {
		while((str=br.readLine())!=null) {
			if(str.equalsIgnoreCase("exit")) {
				break;
			}
			 System.out.println(str.toUpperCase());
			 //str = br.readLine();
		 }
		br.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	}

}
