package com.wz.se.ch02;

public class OperatorDemo03
{
	public static void main(String[] args)
	{
		// ��ֵ����� �������==��ֵ���
		int a = 10 ; // ��ʾ������10��ֵ������a��ַ����Ӧ���ڴ�������

		a += 3; //�ȼ���a = a + 3
		System.out.println(a);

		a -= 3; // �ȼ��� a = a - 3;
		System.out.println(a);	

		short s1 = 1;
		//s1 = s1 + 1; // ����ʱ ����û��Ч��  ��Ҫǿ������ת��
		s1 += 1; // ʹ����չ��ֵ�����ϵͳ���Զ���������ǿ������ת��
		System.out.println(s1);

		// ʵ�����������Ļ���
		int x = 10;
		int y = 20;
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x=" + x + " y=" + y);
	}
}