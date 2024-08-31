package com.wz.se.ch04.array;

import java.util.Arrays;

public class ArrayDemo04 {

	/**
	 * [33,55,77,999]
	 * @param args
	 */
	public static void main(String[] args) {
		//int[] a1 = new int[]{1,2,3,4,5,6,7,8,9};
		int a1[] = {1,2,3,4,5,6,7,8,9};
		int[] a2 = new int[]{33,55,77,999};
		// 通过遍历的形式获取数组中的每个元素
		printArray(a2);
		System.out.println(a1);
		System.out.println(arrayToString(a1));
		System.out.println(arrayToString(a2));
		// Arrays
		System.out.println(Arrays.toString(a1));
	}
	
	/**
	 * 将数组转换为如下格式的字符串
	 * [33,55,77,999]
	 * 解决的思路：
	 *    1.声明一个字符串 String arrayStrinig = "[";
	 *    2.变量获取数组中的每个元素 拼接在 arrayString中 
	 *    3.在循环结束后 将 "]" 拼接到arrayString的结尾
	 * @param a
	 * @return
	 */
	public static String arrayToString(int[] a){
		String arrayString = "[";
		for(int i = 0 ; i < a.length; i ++){
			if(i == a.length-1){
				// 获取数组中的最后一个元素
				arrayString += a[i];
			}else{
				arrayString += a[i]+",";
			}
		}
		arrayString += "]";
		return arrayString;
	}
	
	/**
	 *  方法结合数组改进
	 * @param a[]
	 */
	public static void printArray(int[] a){
		for(int i = 0 ; i < a.length ; i ++){
			System.out.println(a[i]);
		}
	}
	
	

}
