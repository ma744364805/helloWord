package com.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

public class NFDFlightDataTimerTask extends TimerTask{
	private static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public void run() {
        try {
             //������д��Ҫִ�е�����
            System.out.println("ִ�е�ǰʱ��"+formatter.format(Calendar.getInstance().getTime()));
        } catch (Exception e) {
            System.out.println("-------------������Ϣ�����쳣--------------");
        }
    }
}
