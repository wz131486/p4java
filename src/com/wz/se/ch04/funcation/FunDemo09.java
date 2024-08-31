package com.wz.se.ch04.funcation;

public class FunDemo09 {

	/**
	 * 加法运算
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(add(1,3));
		System.out.println(add(1.1,3.3));

	}
	
	/**
	 * 只能完成int类型的数据的相加
	 * @param x
	 * @param y
	 * @return
	 */
	public static int add(int x , int y){
		System.out.println("int:" + (x+y));
		return x + y;
	}
	
	public static String add(String y , int x){
		System.out.println("int:" + (x+y));
		return x + y;
	}
	
/*	public static void add(String y , int x){
		System.out.println("int:" + (x+y));
		return ;
	}*/
	
	public static String add(int x , String y  ){
		System.out.println("int:" + (x+y));
		return x + y;
	}
	
	public static double add(double x,double y){
		System.out.println("double:" + (x+y));
		return x + y;
	}

}
