package com.test;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class RemindJob implements Job{
	private Service service=new Service();
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		service.printMessage();
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}

}
