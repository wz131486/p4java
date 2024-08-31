package com.wz.se.ch04.funcation;

import java.util.Scanner;

public class FunDemo05 {

	/**
	 * 键盘录入年份判断是否是闰年
	 *   1.把方法的基本结构定义出来
	 *   2.根据得到的年份实现闰年判断的逻辑
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个年份:");
		int year = in.nextInt();
		boolean flag = isLeapYear(year);
		if(flag){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
			

	}
	
	/**
	 * 判断 year 是否是闰年
	 * 闰年的规则：
	 *    1.year能被4整除同时year不能被100整除
	 *    2.或者year能被400整除
	 * @param year
	 * @return
	 */
	public static boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0){
			// 表示满足闰年的条件
			return true;
		}
		return false;
	}

}
