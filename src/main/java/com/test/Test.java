package com.test;

import java.util.Date;

import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;




public class Test {
	public static void tool() throws Exception{
        //����Job
       JobDetail job = JobBuilder.newJob(RemindJob.class)
                       .withIdentity("job1", "group1").build();
        
       //����Trigger
      Date runTime = DateBuilder.evenMinuteDate(new Date(System.currentTimeMillis()));
      Trigger trigger = TriggerBuilder.newTrigger()
              .withIdentity("trigger1", "group1")
              .startAt(runTime).build();
  
      //��Job��Trigger
      //���������߹���
      SchedulerFactory sf = new StdSchedulerFactory();
      //����һ��������
      Scheduler sched = sf.getScheduler();
     //ע�Ტ���е���
      sched.scheduleJob(job,trigger);
     //��������
      sched.start();
       
      /*Thread.sleep(3000);
      sched.shutdown();*/
  }
   
   
public static void main(String[] args) throws Exception {
  tool();
  System.out.println("���");
}
}
