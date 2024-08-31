package com.wz.se.ch04.array;

public class ArrayDemo01 {
	
	// 定义一个全局变量
	static int sum ;
	static boolean flag;

	public static void main(String[] args) {
		System.out.println(sum);
		System.out.println(flag);
		// 定义一个局部变量
		int i = 10;
		fun1();

	}
	
	public static void fun1(){
		int a = 30;
		System.out.println("fun1-->" + a);
		fun2();
	}
	
	public static void fun2(){
		//System.out.println(a);
	}

}
