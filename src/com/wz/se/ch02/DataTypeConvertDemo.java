package com.wz.se.ch02;

public class DataTypeConvertDemo
{
	public static void main(String[] args)
	{
		// �Զ�����ת��
		byte by1 = 20;
		int i = by1; // �� byte ���͵ı�����ֵ���� int ���͵ı���
		System.out.println(i);
		// ǿ������ת��
		// float f1 = 9.9; // �������� Ĭ�ϵľ��� double����
		// System.out.println(f1);
		// Ŀ������  ������ = (Ŀ������) ��ת��������;
		float f1 = (float)9.9;
		// ���ݵ����
		short s1 = (short)123456;
		// ���ݵľ��ȶ�ʧ
		int i2 = (int)3.3;
		System.out.println(f1);
		System.out.println(s1);
		System.out.println(i2);

		// ����
		byte by2 = 100;
		// byte by3 = 129;
		// short short1 = 32768;
		char c1 = 65535;
		System.out.println(c1);

		// short��byte���� ͬ char����ת����ʱ����Ҫǿ������ת��
		byte by4 = 120;
		char c2 = (char)by4;
		System.out.println(c2);
		char c3 = 'd';
		byte by5 =(byte) c3;
		System.out.println(by5);

		short s2 = 666;
		char c4 = (char)s2;
		System.out.println(c4);
		// ���ʽ���͵�����
		double d = 2.67;
		int i3 = 50;
		//int i4 = (int)d + i3; // double �� int �������� double
		int i4 =(int)(d + i3);
		System.out.println(i4);

		// 
		char c5 = 'a';
		short s3 = (short)(c5 + 1); // c5 + 1 �õ��Ľ����������int
		System.out.println(s3);

		char c6 = 'A';
		byte b6 = 1;
		short s4 =  (short)(c6 + b6);
		System.out.println(s4);

		// boolean bool1 = false;
		// System.out.println(bool1 + 1);
		// short s5 = bool1;

		String ss = "HelloWorld";
		System.out.println(ss + 2.5);
		// 20101010
		System.out.println(10 + 10 + "10" + 10 + 10);

		byte b7 = 20 + 30;
		System.out.println(b7);

		byte b8 = 30;
		short s6 = 50;
		byte b10 = (byte)(b8 + s6);
		System.out.println(b10);
		byte b9 = 10;
		byte b11  = (byte)(b8 + b9);
		System.out.println(b11);
	}
}