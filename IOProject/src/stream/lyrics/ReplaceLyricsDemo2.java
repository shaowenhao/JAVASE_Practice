package stream.lyrics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReplaceLyricsDemo2 {
     
	static final String FilePath="D:\\eclipse-workspace\\IOProject\\src\\stream\\lyrics\\lyrics.dat";
	
	public static void main(String[] args) {
		String content = readFileByReader(FilePath);
		//System.out.print(content);
		writeFileByWriter(content, FilePath);
	}
	
	public static String readFileByReader(String filePath) {
		Reader reader =null;
		BufferedReader bReader = null;
		StringBuffer sBuffer = new StringBuffer();
		 try {
			reader = new FileReader(FilePath);
			bReader = new BufferedReader(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		 String line = null;
		 try {
			while((line = bReader.readLine())!=null) {
				 sBuffer.append(line);
				 sBuffer.append(System.getProperty("line.separator"));	
     }
			// delete last separator
			sBuffer.delete(sBuffer.lastIndexOf(System.getProperty("line.separator")), sBuffer.length());
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				bReader.close();
				reader.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}
		return sBuffer.toString(); 
	}
	
	
	public static void writeFileByWriter(String content, String filePath) {
		Writer writer =null;
		BufferedWriter bWriter = null;
		
		try {
			writer = new FileWriter(filePath);
			bWriter = new BufferedWriter(writer);
			bWriter.write(content);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				bWriter.close();
				writer.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("Done replace in Lyrics");
	}
	
	
//	public static void main(String[] args) {
//		Reader reader =null;
//		Writer writer =null;
//		BufferedReader bReader = null;
//		BufferedWriter bWriter = null;
//		StringBuffer sBuffer = new StringBuffer();
//		try {
//			 reader = new FileReader(FilePath);
//			 bReader = new BufferedReader(reader);
//			 String line = null;
//			 while((line = bReader.readLine())!=null) {
//				 sBuffer.append(line);
//				 sBuffer.append(System.getProperty("line.separator"));				 
//			 }
//			 
//			String newLyricString = sBuffer.toString().replaceAll("（男）", "（男:）").replaceAll("（女）", "（女:）");
//			writer = new FileWriter(FilePath);
//			bWriter = new BufferedWriter(writer);
//			bWriter.write(newLyricString);
//			System.out.println("Done replace in Lyrics");
//			 
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				bReader.close();
//				reader.close();
//				bWriter.close();
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//			
//		}
//        
//	}

}
