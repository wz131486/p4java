package com.wz.se.ch02;

public class OperatorDemo05
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		// 按位 & 都为true 结果 true
		System.out.println((a > b ) & (a < b)) ; // false &  true = false
		System.out.println((a < b ) & (a > b)) ; // true & false = false
		System.out.println((a < b ) & (a < b)) ; // true & true = true
		System.out.println((a > b ) & (a > b)) ; // false & false = false
		System.out.println("----------------------------");
		// 按位 | 有true 就为true
		System.out.println((a > b ) | (a < b)) ; // false |  true = true
		System.out.println((a < b ) | (a > b)) ; // true | false = true
		System.out.println((a < b ) | (a < b)) ; // true | true = true
		System.out.println((a > b ) | (a > b)) ; // false | false = false
		System.out.println("----------------------------");
		// 按位 异或 相同为false 不同为true
		System.out.println((a > b ) ^ (a < b)) ; // false ^  true = true
		System.out.println((a < b ) ^ (a > b)) ; // true ^ false = true
		System.out.println((a < b ) ^ (a < b)) ; // true ^ true = false
		System.out.println((a > b ) ^ (a > b)) ; // false ^ false = false
		System.out.println("----------------------------");
		//System.out.println((a > 15) & (a / 0) == 0); // false  & false
		System.out.println((a > 15) && (a / 0) == 0); // false && 

		System.out.println(( a < 15) || (a / 0 ) == 0);

		System.out.println(!!!!!!!!!!!!(a > b));

	}
}