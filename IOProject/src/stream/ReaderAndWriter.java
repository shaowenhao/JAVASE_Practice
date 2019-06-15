package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriter {

	private static  final String FilePath1 ="D:/eclipse-workspace/IOProject/src/stream/CopyPaste.java";
	private static  final String FilePath2 ="D:/eclipse-workspace/IOProject/src/stream/CopyPaste_bak.java";
	
	public static void main(String[] args) {
		BufferedReader bufferedReader =null;
		BufferedWriter bufferedWriter =null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FilePath1));
			 bufferedWriter = new BufferedWriter(new FileWriter(FilePath2));
			String line=null;
			while((line=bufferedReader.readLine())!=null) {
				//System.out.println(line);
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bufferedWriter.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		

	}

}
