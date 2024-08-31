package com.wz.se.ch04.array;

public class ArrayDemo05 {

	/**
	 * 计算5个学员的平均分
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double[] score = {67,89,87,68,54};
		// 记录学员总分
		double sum = 0;
		for(int i = 0 ; i < score.length; i ++){
			sum += score[i];
		}
		System.out.println("5个学员的平均分是：" + sum/5);

	}

}
