package com.wz.se.ch04.funcation;

public class FunDemo02 {

	/**
	 * 为什么要使用方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 在控制台输出 1 到 100的偶数
		printEven(1, 100);
		// 在控制台输出300 到500的偶数
		printEven(300, 500);
		// 在控制台输出200 到1000的偶数
		printEven(200, 1000);
	}
	
	/**
	 * 我们定义的第一个方法
	 *    作用：输入 x 到 y之间的所有的偶数
	 * @param x
	 * @param y
	 */
	public static void printEven(int x,int y){
		for (int i = x ; i <= y ; i++) {
			if(i % 2 == 0){
				System.out.println( i);
			}
		}
	}

}
