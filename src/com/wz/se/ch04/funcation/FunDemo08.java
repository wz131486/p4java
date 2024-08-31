package com.wz.se.ch04.funcation;

public class FunDemo08 {

	public static boolean isPrimeNumber(int num){
		boolean isPrime = true; // 默认是素数
		// 让 num 对 2到num-1 取余，如果结果都不为0说明是素数否则不是
		for(int j = 2 ; j <= num/2 ; j++){
			if(num % j == 0){
				// 说明不是素数
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	// 键盘录入数据，返回两个数中较大的值
	public static int max(int i , int j){
		/*if(i >= j){
			return i;
		}
		return j;*/
		return i >= j ? i : j;
	}
	
	public static boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
			// 表示满足闰年的条件
			return true;
		}
		return false;
	}
	
	public static int add(int x,int y,String z,double d){
		int sum = x + y; // 方法体
		return sum;
	}
	
	public static void show(){
		System.out.println("HelloWorld");
		return ;
	}
	
	public static void main(String[] args) {
		add(1,2,"aaa",12);
		show(); // 直接调用
	}
}
