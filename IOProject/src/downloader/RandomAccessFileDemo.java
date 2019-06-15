package downloader;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RandomAccessFileDemo {
	
	public static final String  STRURL_STRING = "http://perf-cli-02:8080/job/Run_Suite/LOCALE=default,SUITE=boss,label=regression/7048/artifact/build/logs/cs_server_events.log";
	

	private static final int MAX_BUFFER_SIZE = 102400; 
	public static void main(String[] args) {
//		
//		1.打开http连接，获得下载内容的长度
//		2.创建RandomAccessFile对象
//		3.将下载的内容缓存到字节数组中
//		4.将缓存字节数组通过RandomAccessFile对象写入到文件中（涉及到一个文件指针的操作）
		HttpURLConnection connection=null;
		BufferedInputStream bInputStream = null;
		try {
			URL url = new URL(STRURL_STRING);
		    connection =(HttpURLConnection) url.openConnection();
		    connection.setRequestProperty("Range", "bytes=0-");
		    connection.connect();
		    
		    if(connection.getResponseCode() /100 != 2) {
		    	System.out.println("Connection failed");
		    	return;
		    }
		    int fileSize = connection.getContentLength();
		    System.out.println("file Size:"+ fileSize);
		    bInputStream = new BufferedInputStream(connection.getInputStream(), MAX_BUFFER_SIZE);
		    int downloaded = 0; 
		    String fileName = url.getFile();
		    fileName = fileName.substring(fileName.lastIndexOf("/")+1);
		    RandomAccessFile file = new RandomAccessFile(fileName, "rw");
		    file.setLength(0);
		    file.seek(0);
		    while(downloaded < fileSize) {
		    	byte[] buffer=null;
		    	if(fileSize - downloaded >MAX_BUFFER_SIZE) {
		    		buffer = new byte[MAX_BUFFER_SIZE];
		    	}else {
		    		buffer = new byte[fileSize-downloaded];
		    	}
		        int read = bInputStream.read(buffer);
		        if(read ==-1) break;
		        file.seek(downloaded);
		        file.write(buffer, 0, read);
		        downloaded += read;
		        System.out.println( "downloaded percentage:" + downloaded * 1.0 / fileSize *100 + "%");
		    }
		
		    
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace(); 
		}finally {
			connection.disconnect();
			try {
				bInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
