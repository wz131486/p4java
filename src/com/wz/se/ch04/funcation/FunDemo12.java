package com.wz.se.ch04.funcation;

public class FunDemo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFibonacci(9));
	}
	/**
	 * 获取斐波拉契数列
	 * @return
	 */
	public static int getFibonacci(int n){
		// 定位到 出口
		if(n == 1 || n == 2){
			return 1;
		}
		
		return getFibonacci(n-1) + getFibonacci(n-2);
	}

}
