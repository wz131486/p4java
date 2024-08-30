package com.wz.se.ch02;

public class OperatorDemo06
{
	public static void main(String[] args)
	{
		// 计算两个数的最大值
		int a = 30;
		int b = 50;
		int max = a > b ? a : b;
		System.out.println("两个数的最大值是:" + max);

		// 计算三个数的最大值
		int x = 1000;
		int y = 3000;
		int z = 2000;
		int max2 = (x > y) ? ( (x > z) ? x: z ) : ( (y > z) ? y : z);
		System.out.println("三个数中的最大值是:" + max2);
		
		// 如果这次考试成绩90分以上奖励手机一部
		// 否则 做家务活一周
		double score = 100;
		String prize = (score >= 90)? "奖励手机一部": "做一周家务活";
		System.out.println(prize);

	}
}