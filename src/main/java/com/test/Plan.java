package com.test;

public class Plan {
	private String date;
	private String task;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	@Override
	public String toString() {
		return "Plan [date=" + date + ", task=" + task + "]";
	}
	public Plan() {
		// TODO Auto-generated constructor stub
	}
	public Plan(String date,String task){
		super();
        this.date = date;
        this.task = task;
		
	}
}
