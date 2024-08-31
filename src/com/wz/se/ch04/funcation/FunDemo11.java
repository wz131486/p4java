package com.wz.se.ch04.funcation;

public class FunDemo11 {

    /**
     * 求n的阶乘   5 ！  5*4*3*2*1
     *
     * @param args
     */
    public static void main(String[] args) {
        //System.out.println(getFactorial(10));
        System.out.println(getFactorialRecursion(10));
    }

    /**
     * 通过递归的方式来实现N的阶乘计算
     * 分析 递归的出口
     * 5!=5*4!=5*4*3!
     *
     * @param num
     * @return
     */
    public static int getFactorialRecursion(int num) {
        if (num < 0) {
            return 0;
        }
        // 先确定递归的出口
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * getFactorialRecursion(num - 1);
        }
    }


    /**
     * 普通的获取num的阶乘
     *
     * @param num
     * @return
     */
    public static int getFactorial(int num) {
        if (num <= 0) {
            return 0;
        }
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }


}
