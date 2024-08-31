package com.wz.se.ch04.funcation;

import java.util.Scanner;

public class FunDemo06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入两个要比较的整数:");
		int x = in.nextInt();
		System.out.println("再输入一个：");
		int y = in.nextInt();
		int max = max(x, y);
		System.out.println(x + " 和 " + y +"中值大的是："+ max);

	}
	
	// 键盘录入数据，返回两个数中较大的值
	public static int max(int i , int j){
		/*if(i >= j){
			return i;
		}
		return j;*/
		return i >= j ? i : j;
	}

}
