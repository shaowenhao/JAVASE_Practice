package stream.lyrics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReplaceLyricsDemo {
     
	static final String FilePath="D:\\eclipse-workspace\\IOProject\\src\\stream\\lyrics\\lyrics.dat";
	
	public static void main(String[] args) {
		Reader reader =null;
		Writer writer =null;
		BufferedReader bReader = null;
		BufferedWriter bWriter = null;
		StringBuffer sBuffer = new StringBuffer();
		try {
			 reader = new FileReader(FilePath);
			 bReader = new BufferedReader(reader);
			 String line = null;
			 while((line = bReader.readLine())!=null) {
				 sBuffer.append(line);
				 sBuffer.append(System.getProperty("line.separator"));				 
			 }
			 
			String newLyricString = sBuffer.toString().replaceAll("（男）", "（男:）").replaceAll("（女）", "（女:）");
			writer = new FileWriter(FilePath);
			bWriter = new BufferedWriter(writer);
			bWriter.write(newLyricString);
			System.out.println("Done replace in Lyrics");
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bReader.close();
				reader.close();
				bWriter.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
        
	}

}
