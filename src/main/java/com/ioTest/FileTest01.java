package com.ioTest;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
	public static void main(String[] args) throws IllegalAccessException, IOException {
		// FileUtils.listDirectory(new File("E:/file"));
		try {
			IOUtils.printIO("E:\\file\\ad.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
