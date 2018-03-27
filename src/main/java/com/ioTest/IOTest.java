package com.ioTest;

import java.io.File;

public class IOTest {

	public static void main(String[] args) throws Exception {
		File file= new File("E:/redis/i");
		//判断目录是否存在，如果不存在，则创建目录
		if(!file.exists()){
			file.mkdirs();
		}
		//是否是一个目录
		System.out.println(file.isDirectory());
		//是否是一个文件
		System.out.println(file.isFile());
		System.out.println(file);
	}

}
