package com.wz.se.ch02;

public class OperatorDemo06
{
	public static void main(String[] args)
	{
		// ���������������ֵ
		int a = 30;
		int b = 50;
		int max = a > b ? a : b;
		System.out.println("�����������ֵ��:" + max);

		// ���������������ֵ
		int x = 1000;
		int y = 3000;
		int z = 2000;
		int max2 = (x > y) ? ( (x > z) ? x: z ) : ( (y > z) ? y : z);
		System.out.println("�������е����ֵ��:" + max2);
		
		// �����ο��Գɼ�90�����Ͻ����ֻ�һ��
		// ���� �������һ��
		double score = 100;
		String prize = (score >= 90)? "�����ֻ�һ��": "��һ�ܼ����";
		System.out.println(prize);

	}
}