package propertiesdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(PropertiesDemo.class.getResourceAsStream("config.peoperties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(properties.getProperty("user")); 
        properties.setProperty("password", "123qwer");
        try {
			FileOutputStream fileOutputStream = new FileOutputStream("bin/propertiesdemo/config.peoperties");
			 
	        properties.store(fileOutputStream, "comment  by ryan");
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	}

}
