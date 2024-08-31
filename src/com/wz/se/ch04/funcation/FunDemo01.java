package com.wz.se.ch04.funcation;

public class FunDemo01 {

	/**
	 * 为什么要使用方法
	 * @param args
	 */
	public static void main(String[] args) {
		// 在控制台输出 1 到 100的偶数
		for (int i = 1 ; i <= 100 ; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		// 在控制台输出300 到500的偶数
		for (int i = 300 ; i <= 500 ; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
		// 在控制台输出200 到1000的偶数
		for (int i = 200 ; i <= 1000 ; i++) {
			if(i % 2 == 0){
				System.out.println(i);
			}
		}
	}

}
