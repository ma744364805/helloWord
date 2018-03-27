package com.ioTest;

import java.io.FileInputStream;
import java.io.IOException;

public class IOUtils {
	public static void printIO(String filename) throws IOException{
		FileInputStream fis=new FileInputStream(filename);
		int b;
		int i=1;
		while ((b = fis.read())!=-1) {
			
			System.out.print(Integer.toHexString(b)+" ");
			if(i++%10==0){
				System.out.println();
			}
		}
		fis.close();
	}
}
