package data.mashibing.stringdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class TestTransform1 {

	public static void main(String[] args) {
	
		try {
		//	OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("d:/1.txt",false), "GBK");
			OutputStreamWriter osw= new OutputStreamWriter(new FileOutputStream("d:/1.txt",false)); //Cp1252
			String s = "hello world";
			System.out.println(osw.getEncoding());
			osw.write(s);
			osw.flush();
			osw.close();
		} catch (UnsupportedEncodingException e) {			
			e.printStackTrace();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
