package com.test;

import java.util.ArrayList;
import java.util.List;

public class Service {
	 public List<Plan> getPlans(){
	        List<Plan> list=new ArrayList<Plan>();
	        Plan p1=new Plan("2016年12月17日","计划一");
	        Plan p2=new Plan("2016年12月18日","计划二");
	         
	        list.add(p1);
	        list.add(p2);
	        return list;
	         
	    }
	  public void printMessage(){
	        List<Plan> list= getPlans();
	        for (Plan plan : list) {
	            System.out.println("计划的时间："+plan.getDate()+"\t"+"计划内容："+plan.getTask());
	        }
	    }
}
