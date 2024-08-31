package com.wz.se.ch04.array;

import java.util.Arrays;

public class ArrayDemo09 {

	/**
	 * 选择排序
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {1,4,3,5,2};
		System.out.println("排序前：" );
		System.out.println(Arrays.toString(a));
		/*// 第一趟
		int i = 0 ;
		for(int j = 1 ; j < a.length; j ++){
			if(a[j] < a[i]){
				int temp = 0 ; 
				temp = a[j];
				a[j] = a[i];
				a[i]=temp;
			}
		}

		System.out.println("第一趟排序：");
		System.out.println(Arrays.toString(a));
		// 第2趟
		i = 1 ;
		for(int j = 2 ; j < a.length; j ++){
			if(a[j] < a[i]){
				int temp = 0 ; 
				temp = a[j];
				a[j] = a[i];
				a[i]=temp;
			}
		}

		System.out.println("第2趟排序：");
		System.out.println(Arrays.toString(a));
		
		// 第3趟
		i = 2 ;
		for(int j = 3 ; j < a.length; j ++){
			if(a[j] < a[i]){
				int temp = 0 ; 
				temp = a[j];
				a[j] = a[i];
				a[i]=temp;
			}
		}

		System.out.println("第3趟排序：");
		System.out.println(Arrays.toString(a));
		
		// 第4趟
		i = 3 ;
		for(int j = 4 ; j < a.length; j ++){
			if(a[j] < a[i]){
				int temp = 0 ; 
				temp = a[j];
				a[j] = a[i];
				a[i]=temp;
			}
		}

		System.out.println("第4趟排序：");
		System.out.println(Arrays.toString(a));*/
		/*for(int i = 0 ; i < a.length -1 ; i++){
			for(int j = i+1 ; j < a.length; j ++){
				if(a[j] < a[i]){
					int temp = 0 ; 
					temp = a[j];
					a[j] = a[i];
					a[i]=temp;
				}
			}
		}*/
		selectSort(a);
		System.out.println("选择排序：");
		System.out.println(Arrays.toString(a));
	}
	
	public static void selectSort(int[] a){
		for(int i = 0 ; i < a.length -1 ; i++){
			for(int j = i+1 ; j < a.length; j ++){
				if(a[j] < a[i]){
					int temp = 0 ; 
					temp = a[j];
					a[j] = a[i];
					a[i]=temp;
				}
			}
		}
	}

}
