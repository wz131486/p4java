package com.wz.se.ch04.array;

import java.util.Arrays;

public class ArrayDemo08 {

	/**
	 * 冒泡排序
	 *      1 4 3 5 2
	 *         1 3 4 2 5
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,4,3,5,2};
		System.out.println("排序前：" );
		System.out.println(Arrays.toString(a));
		// 第一趟排序
		/*for (int i = 0 ; i < a.length-1-0 ; i++) {
			if(a[i] > a[i+1]){
				int temp = 0 ; 
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("第一趟排序后：");
		System.out.println(Arrays.toString(a));
		// 最后一位数值肯定是最大的
		// 第二趟排序
		for (int i = 0 ; i < a.length-1-1 ; i++) {
			if(a[i] > a[i+1]){
				int temp = 0 ; 
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("第二趟排序后：");
		System.out.println(Arrays.toString(a));
		// 第三趟排序
		for (int i = 0 ; i < a.length-1-2 ; i++) {
			if(a[i] > a[i+1]){
				int temp = 0 ; 
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("第三趟排序后：");
		System.out.println(Arrays.toString(a));
		
		// 第四趟排序
		for (int i = 0 ; i < a.length-1-3 ; i++) {
			if(a[i] > a[i+1]){
				int temp = 0 ; 
				temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		System.out.println("第四趟排序后：");
		System.out.println(Arrays.toString(a));*/
		/*for(int i = 0 ; i < a.length-1; i ++){
			for(int j = 0 ; j < a.length-1 - i; j ++ ){
				if(a[j] > a[j+1]){
					int temp = 0 ; 
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;	
				}
				
			}
		}*/
		bubbleSort(a);
		System.out.println("冒泡排序后：");
		System.out.println(Arrays.toString(a));
	}
	
	public static void bubbleSort(int[] a){
		for(int i = 0 ; i < a.length-1; i ++){
			for(int j = 0 ; j < a.length-1 - i; j ++ ){
				if(a[j] < a[j+1]){
					int temp = 0 ; 
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;	
				}
			}
		}
	}

}
