package com.wz.se.ch04.funcation;

public class FunDemo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show();
	}
	
	public static void show(){
		System.out.println("hello...");
		int random = (int) (Math.random() * 10);
		if(random == 5){
			return ;
		}
		// 方法中是可以再继续调用其他方法的
		show();
	}

}
