package com.ioTest;

import java.io.File;

public class IOTest {

	public static void main(String[] args) throws Exception {
		File file= new File("E:/redis/i");
		//�ж�Ŀ¼�Ƿ���ڣ���������ڣ��򴴽�Ŀ¼
		if(!file.exists()){
			file.mkdirs();
		}
		//�Ƿ���һ��Ŀ¼
		System.out.println(file.isDirectory());
		//�Ƿ���һ���ļ�
		System.out.println(file.isFile());
		System.out.println(file);
	}

}
