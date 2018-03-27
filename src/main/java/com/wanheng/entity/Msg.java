package com.wanheng.entity;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	private int code;
	
	private String msg;
	
	private Map<String,Object> entend=new HashMap<String,Object>();
	
	public static Msg success() {
		Msg result=new Msg();
		result.setCode(100);
		result.setMsg("³É¹¦");
		return result;	
	}
	public Msg add(String key,Object value) {
		this.getEntend().put(key, value);
		return this;
		
	}
	public static Msg fail() {
		Msg result=new Msg();
		result.setCode(200);
		result.setMsg("Ê§°Ü");
		return result;	
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Map<String, Object> getEntend() {
		return entend;
	}
	public void setEntend(Map<String, Object> entend) {
		this.entend = entend;
	}
	
}
