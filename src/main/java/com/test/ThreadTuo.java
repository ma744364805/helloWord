package com.test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadTuo {
	public void test(int i,int j){
		 Runnable runnable = new Runnable() {  
	        	
	            public void run() {  
	                // task to run goes here  
	            	try {
						
						 System.out.println("Hello !!---------------------"+ new Date()); 
						 Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	               
	            }  
	        };  
	        ScheduledExecutorService service = Executors  
	                .newSingleThreadScheduledExecutor();  
	        // �ڶ�������Ϊ�״�ִ�е���ʱʱ�䣬����������Ϊ��ʱִ�еļ��ʱ��  
	        service.scheduleAtFixedRate(runnable, i, j, TimeUnit.SECONDS);  
	}
}

