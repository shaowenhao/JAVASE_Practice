package data.mashibing.stringdemo;

import java.io.File;

public class DirectoryTraversal {

	public static void main(String[] args) {
		String filePath = args[0];
		File dir = new File(filePath);

		directoryTraversal(dir);
	}

	public static void directoryTraversal(File dir) {

		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				directoryTraversal(files[i]);
				
			}else if (files[i].isFile()) {
				System.out.println(files[i].getName());
			}
			
		}
	}

}