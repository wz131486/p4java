package com.wz.se.ch02;

public class OperatorDemo02
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		// a = 10 b = 20
		System.out.println("a = " + a + " b =  " + b);
		//a ++;
		//b --;
		// a = 11 b = 19
		//System.out.println("a = " + a + " b =  " + b);

		++ a ;
		-- b ;
		// a = 11 b = 19
		System.out.println("a = " + a + " b =  " + b);

		// ++ -- ≤Œ”Î‘ÀÀ„
		int a1 = 3;
		int a2 = 4;
		int result = (a1++)/3 + (--a2)*2 -(a1--)%6 + (a2++)*3 - (a2--);
		/*
			a      3    4       3       
			b      4    3            4      3
			result 3/3 + 3*2 - 4%6 + 3*3 - 4 = 1 + 6 -4 + 9 - 4 =8
		*/
		System.out.println("a1=" + a1 + "  a2="+a2 + " result="+result);
	}
}