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
        //构建Job
       JobDetail job = JobBuilder.newJob(RemindJob.class)
                       .withIdentity("job1", "group1").build();
        
       //构建Trigger
      Date runTime = DateBuilder.evenMinuteDate(new Date(System.currentTimeMillis()));
      Trigger trigger = TriggerBuilder.newTrigger()
              .withIdentity("trigger1", "group1")
              .startAt(runTime).build();
  
      //绑定Job和Trigger
      //创建调度者工厂
      SchedulerFactory sf = new StdSchedulerFactory();
      //创建一个调度者
      Scheduler sched = sf.getScheduler();
     //注册并进行调度
      sched.scheduleJob(job,trigger);
     //启动调度
      sched.start();
       
      /*Thread.sleep(3000);
      sched.shutdown();*/
  }
   
   
public static void main(String[] args) throws Exception {
  tool();
  System.out.println("你猜");
}
}
