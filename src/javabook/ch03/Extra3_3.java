package javabook.ch03;

import java.io.*;

public class Extra3_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iFirstOperand = 0, iSecondOperand = 0, iRetValue = 0;
		char cOperator = 0;
		
		System.out.println("ù ��° ���� �Է��Ͻÿ�.");
		iFirstOperand = Integer.parseInt(in.readLine());
		
		System.out.println("�����ڸ� �Է��Ͻÿ�. [+, -, *, /]");
		cOperator = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("�� ��° ���� �Է��Ͻÿ�.");
		iSecondOperand = Integer.parseInt(in.readLine());
		
		if(cOperator == '+') {
			iRetValue = iFirstOperand + iSecondOperand;
		} else if(cOperator == '-') {
			iRetValue = iFirstOperand - iSecondOperand;
		} else if(cOperator == '*') {
			iRetValue = iFirstOperand * iSecondOperand;
		} else if(cOperator == '/') {
			iRetValue = iFirstOperand / iSecondOperand;
		} else {
			System.out.println("������ ���� �ʽ��ϴ�.");
			System.exit(0);
		}
		System.out.printf("��� ���� %d�Դϴ�.", iRetValue);
		System.exit(0);
	}

}
