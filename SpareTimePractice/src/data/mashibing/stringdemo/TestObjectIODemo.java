package data.mashibing.stringdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestObjectIODemo {

	public static void main(String[] args) {
       T t=new T();
       t.i = 100;
       try {
		FileOutputStream fos= new FileOutputStream("d:/1.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(t);
		oos.flush();
		oos.close();
		
		FileInputStream fis= new FileInputStream("d:/1.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		T tReadT = (T)ois.readObject();
		System.out.println(tReadT.i+" "+tReadT.j+" "+tReadT.k);
		
	  } catch (FileNotFoundException e) {		  
		e.printStackTrace();
	 } catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
       

	}

}

class T implements Serializable {
	public int i = 2;
	public double j = 1.234;
	public boolean k = false;
}