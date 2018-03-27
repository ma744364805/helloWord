package com.ioTest;

import java.io.File;
import java.io.IOException;


public class FileUtils {
	public static void listDirectory(File dir) throws IOException, IllegalAccessException{
		if(!dir.exists()){
			throw new IllegalAccessException("Ŀ¼:"+dir+"������");
		}
		if(!dir.isDirectory()){
			throw new IllegalAccessException(dir+"�ǲ���Ŀ¼");
		}
		/*String[] s=dir.list();
		for (String string : s) {
			System.out.println(dir+"\\"+string);
		}*/
		
		
		//�������е��ļ���Ŀ¼
		File[] file=dir.listFiles();//���ص���ֱ����Ŀ¼�ĳ���
			for (File file2 : file) {
				if(file2.isDirectory()){
					listDirectory(file2);//�ݹ�
				}else{
					System.out.println(file2);
				}
			}
	}
}
