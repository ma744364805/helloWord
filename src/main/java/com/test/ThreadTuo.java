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
	        // 第二个参数为首次执行的延时时间，第三个参数为定时执行的间隔时间  
	        service.scheduleAtFixedRate(runnable, i, j, TimeUnit.SECONDS);  
	}
}

