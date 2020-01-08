package data.mashibing.stringdemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class TestDataStream {

	public static void main(String[] args) {
		ByteArrayOutputStream baos= new ByteArrayOutputStream();
		DataOutputStream dos= new DataOutputStream(baos);
		try {
			dos.writeBoolean(true);
			dos.writeInt(123);
		    ByteArrayInputStream bais= new ByteArrayInputStream(baos.toByteArray());
		    DataInputStream dis = new DataInputStream(bais);
		    System.out.println(dis.readBoolean());
		    System.out.println(dis.readInt());	    
		    dos.close();
		    dis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
  
	}

}
