package com.test;

import java.util.ArrayList;
import java.util.List;

public class Service {
	 public List<Plan> getPlans(){
	        List<Plan> list=new ArrayList<Plan>();
	        Plan p1=new Plan("2016��12��17��","�ƻ�һ");
	        Plan p2=new Plan("2016��12��18��","�ƻ���");
	         
	        list.add(p1);
	        list.add(p2);
	        return list;
	         
	    }
	  public void printMessage(){
	        List<Plan> list= getPlans();
	        for (Plan plan : list) {
	            System.out.println("�ƻ���ʱ�䣺"+plan.getDate()+"\t"+"�ƻ����ݣ�"+plan.getTask());
	        }
	    }
}
