package stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Time;

import javax.xml.transform.OutputKeys;

import org.xml.sax.InputSource;

public class CopyPaste {

	private static  final String FilePath1 = "d:/TIB_tdv_drivers_8.1.0_all.zip";
	private static  final String FilePath2 = "d:/TIB_tdv_drivers_8.1.0_all_2.zip";
	
	public static void main(String[] args) throws IOException {
//        BufferedInputStream inStream = new BufferedInputStream(System.in);
//        byte[] bytes = new byte[200];
//        System.out.println("Please input characters");
//        inStream.read(bytes);
//        System.out.println("Input characters was:" + new String(bytes));
        long time = CopyFileByBufferedStream();
        System.out.println("File copy spend time" + time + "milseconds");
	}

	/**
	 * 
	 * @return  time
	 */
	private static long CopyFileByBufferedStream() {
		File file1 = new File(FilePath1); //File need to copy
		File file2 = new File(FilePath2);
		if(!file1.exists()) {
			System.out.println("File not existed, Copy Failed");
			return 0;
		}
		
		long startTime = System.currentTimeMillis();
		InputStream inputStream = null;
		BufferedInputStream bIntStream =null;
		OutputStream outputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		try {
			 inputStream = new FileInputStream(file1);
			 bIntStream = new BufferedInputStream(inputStream);
			 outputStream = new FileOutputStream(file2);
			 bOutputStream = new BufferedOutputStream(outputStream);
			 int i =-1; 
				while((i=bIntStream.read())!=-1) {
					 bOutputStream.write(i); //
				 }
			 System.out.println("File copy Successfull");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 catch (IOException e) {
				e.printStackTrace();
		}finally {
			try {
				bOutputStream.close();
				outputStream.close();
				bIntStream.close();
				inputStream.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		return endTime -startTime;
	
	}
	
}
