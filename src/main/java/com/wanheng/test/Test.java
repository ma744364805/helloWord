package com.wanheng.test;

public abstract class Test {

	public static void main(String[] args) {
		int[] arr={1,2,4,4,5,6,9,8};
		
		for (int i = 0; i <arr.length; i++) {	
			if(i<4){
                System.out.println(arr[i]);
            } else {
            	System.out.println(arr[i]+"__");
			}
		}
	
		}
	
}
