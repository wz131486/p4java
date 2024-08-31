package com.wz.se.ch04.array;

import java.util.Scanner;

public class ArrayDemo06 {

	/**
	 * 5.2 有一个数列： 8,4,1,0,25,199,33
​       A 循环输出数列值
​	   B 求数列中所有数值的和
​       C 求出最大值
​       D 将数组倒置并输出
​       E  数组查找 猜数字游戏：从键盘中任意输入一个数字判断是否在数列中
​	   F  数组排序
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 8,4,1,0,25,199,33};
		printArray(a);
		System.out.println("数列中所有值的和:" + getSum(a));
		System.out.println("数列中的最大值是：" + getMax(a));
		// 将数组倒置
		reverseArray2(a);
		printArray(a);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数字：");
		int num = input.nextInt();
		System.out.println(num + "是否在数列中：" + isContainsNumInArray(a, num));
	}
	
	/**
	 * 循环输出数列值
	 * @param a
	 */
	public static void printArray(int[] a){
		for(int i = 0 ; i< a.length ; i++){
			System.out.println(a[i]);
		}
	}
	
	/**
	 * 求数列中所有数值的和
	 * @param a
	 * @return
	 */
	public static int getSum(int[] a){
		int sum = 0 ;
		for(int i = 0 ; i < a.length ;i ++){
			sum += a[i];
		}
		return sum;
	}
	
	/**
	 * 求出最大值
	 *  8,4,1,0,25,199,33
	 * @param a
	 */
	public static int getMax(int[] a){
		int max = 0 ;
		for(int i = 0 ; i < a.length ; i ++){
			if(max < a[i]){
				max = a[i];
			}
		}
		return max;
	}
	
	/**
	 * 将数组倒置并输出
	 * 8,4,1,0,25,199,33 
	 * 33 199 25 0 1 4 8
	 * 
	 */
	public static int[] reverseArray1(int[] a){
		int[] b = new int[a.length];
		
		for(int i = a.length-1 ,j=0; i >= 0; i--,j++){
			b[j] = a[i];
		}
		return b;
	}
	
	/**
	 * 将数组倒置并输出
	 * 8,4,1,0,25,199,33 
	 * 33 199 25 0 1 4 8
	 * 第一个数和最后一个数交换位置
	 * a[0] 和  a[a.length-1 -0]
	 * int temp = 0;
	 * temp = a[0]
	 * a[0] = a[a.length-1 -0]
	 * a[a.length-1 -0]=temp
	 * 
	 * 第二个和倒数第二个交换位置
	 * a[1] 和  a[a.length-1 -1]
	 * 
	 * 假设 a.length = 7   3次  a.length/2
	 * 假设 a.length = 6   3次
	 * 假设 a.length = 5   2次
	 *                4   2次
	 *                3   1次
	 *                2   1次
	 *                1   0次
	 */
	public static void reverseArray2(int[] a){
		for(int i=0 ; i < a.length/2 ;i++){
			int temp = 0 ;
			temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i] = temp;
		}
		
	}
	
	/**
	 * 数组查找 猜数字游戏：从键盘中任意输入一个数字判断是否在数列中
	 * @param a
	 * @return
	 */
	public static boolean isContainsNumInArray(int[] a,int num){
		for(int i = 0 ; i < a.length ; i ++){
			if(num == a[i]){
				return true;
			}
		}
		return false;
	}

}
