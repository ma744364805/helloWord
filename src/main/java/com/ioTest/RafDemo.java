package com.ioTest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class RafDemo {
	public static void main(String[] args) throws IOException{
		File demo=new File("E:/demo");
		if (!demo.exists()) {
			demo.mkdirs();
		}
		File file=new File(demo,"demo2.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		RandomAccessFile r=new RandomAccessFile(file, "rw");
		System.out.println(r.getFilePointer());
		r.write('A');
		System.out.println(r.getFilePointer());
		r.write('B');
		 int i=1000000000;
		 
		 r.write(i>>>24);//高八位
		 r.write(i>>>16);
		 r.write(i>>>8);
		 r.write(i);
		 System.out.println(r.getFilePointer());
	}
}
