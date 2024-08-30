package com.wz.se.ch02;

public class DataTypeConvertDemo
{
	public static void main(String[] args)
	{
		// 自动类型转换
		byte by1 = 20;
		int i = by1; // 将 byte 类型的变量赋值给了 int 类型的变量
		System.out.println(i);
		// 强制类型转换
		// float f1 = 9.9; // 浮点类型 默认的就是 double类型
		// System.out.println(f1);
		// 目标类型  变量名 = (目标类型) 被转换的类型;
		float f1 = (float)9.9;
		// 数据的溢出
		short s1 = (short)123456;
		// 数据的精度丢失
		int i2 = (int)3.3;
		System.out.println(f1);
		System.out.println(s1);
		System.out.println(i2);

		// 特例
		byte by2 = 100;
		// byte by3 = 129;
		// short short1 = 32768;
		char c1 = 65535;
		System.out.println(c1);

		// short和byte类型 同 char类型转换的时候都需要强制类型转换
		byte by4 = 120;
		char c2 = (char)by4;
		System.out.println(c2);
		char c3 = 'd';
		byte by5 =(byte) c3;
		System.out.println(by5);

		short s2 = 666;
		char c4 = (char)s2;
		System.out.println(c4);
		// 表达式类型的提升
		double d = 2.67;
		int i3 = 50;
		//int i4 = (int)d + i3; // double 和 int 会提升到 double
		int i4 =(int)(d + i3);
		System.out.println(i4);

		// 
		char c5 = 'a';
		short s3 = (short)(c5 + 1); // c5 + 1 得到的结果的类型是int
		System.out.println(s3);

		char c6 = 'A';
		byte b6 = 1;
		short s4 =  (short)(c6 + b6);
		System.out.println(s4);

		// boolean bool1 = false;
		// System.out.println(bool1 + 1);
		// short s5 = bool1;

		String ss = "HelloWorld";
		System.out.println(ss + 2.5);
		// 20101010
		System.out.println(10 + 10 + "10" + 10 + 10);

		byte b7 = 20 + 30;
		System.out.println(b7);

		byte b8 = 30;
		short s6 = 50;
		byte b10 = (byte)(b8 + s6);
		System.out.println(b10);
		byte b9 = 10;
		byte b11  = (byte)(b8 + b9);
		System.out.println(b11);
	}
}