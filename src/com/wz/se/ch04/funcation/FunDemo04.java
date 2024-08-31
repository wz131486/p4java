package com.wz.se.ch04.funcation;

public class FunDemo04 {

	/**
	 * 求两个数之和
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(add(1,5));
		System.out.println(add(10,5));
		//String sum = add(20,30);
	}
	
	/**
	 * 求两个数之和
	 * @param x 
	 * @param y
	 * @return
	 */
	public static int add(int x,int y){
		int sum = x + y; // 方法体
		return sum;
	}
	
	

}
