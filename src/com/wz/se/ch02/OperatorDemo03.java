package com.wz.se.ch02;

public class OperatorDemo03
{
	public static void main(String[] args)
	{
		// 赋值运算符 这个不是==赋值语句
		int a = 10 ; // 表示将常量10赋值给变量a地址所对应的内存区域中

		a += 3; //等价于a = a + 3
		System.out.println(a);

		a -= 3; // 等价于 a = a - 3;
		System.out.println(a);	

		short s1 = 1;
		//s1 = s1 + 1; // 变量时 特例没有效果  需要强制类型转换
		s1 += 1; // 使用扩展赋值运算符系统会自动帮助我们强制类型转换
		System.out.println(s1);

		// 实现两个变量的互换
		int x = 10;
		int y = 20;
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x=" + x + " y=" + y);
	}
}