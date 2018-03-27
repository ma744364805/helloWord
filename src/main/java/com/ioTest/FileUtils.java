package com.ioTest;

import java.io.File;
import java.io.IOException;


public class FileUtils {
	public static void listDirectory(File dir) throws IOException, IllegalAccessException{
		if(!dir.exists()){
			throw new IllegalAccessException("目录:"+dir+"不存在");
		}
		if(!dir.isDirectory()){
			throw new IllegalAccessException(dir+"是不是目录");
		}
		/*String[] s=dir.list();
		for (String string : s) {
			System.out.println(dir+"\\"+string);
		}*/
		
		
		//遍历所有的文件和目录
		File[] file=dir.listFiles();//返回的是直接子目录的抽象
			for (File file2 : file) {
				if(file2.isDirectory()){
					listDirectory(file2);//递归
				}else{
					System.out.println(file2);
				}
			}
	}
}
