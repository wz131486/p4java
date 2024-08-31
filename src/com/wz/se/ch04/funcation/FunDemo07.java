package com.wz.se.ch04.funcation;

public class FunDemo07 {

	public static void main(String[] args) {
		for(int i = 2; i < 100; i ++){
			// 调用方法判断是否是素数
			if(isPrimeNumber(i)){
				System.out.println(i);
			}
		}

	}

	/**
	 * 输出1到1000之间的所有的素数
	 * 比1大的整数中，除了1和它本身以外，不再有别的因数，这种整数叫做 质数或者素数
	 * i = 7  7%2 7%3  7%4  7%5  7%6
	 * i=23   23%2 23%3 .... 23%22 
	 * @param num
	 * @return
	 */
	public static boolean isPrimeNumber(int num){
		boolean isPrime = true; // 默认是素数
		// 让 num 对 2到num-1 取余，如果结果都不为0说明是素数否则不是
		for(int j = 2 ; j <= num/2 ; j++){
			if(num % j == 0){
				// 说明不是素数
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
}
