package javabook.ch03;

import java.io.*;

public class SwitchExam {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iFirstOperand = 0, iSecondOperand = 0, iRetValue = 0;
		char cOperator = 0;

		System.out.println("ù ��° ���� �Է��Ͻÿ�.");
		iFirstOperand = Integer.parseInt(in.readLine());

		System.out.println("�����ڸ� �Է��Ͻÿ�.");
		cOperator = (char) System.in.read();
		System.in.read();
		System.in.read();

		System.out.println("�ι� ° ���� �Է��Ͻÿ�.");
		iSecondOperand = Integer.parseInt(in.readLine());
//		
//		System.out.println(iFirstOperand);
//		System.out.println(cOperator);
//		System.out.println(iSecondOperand);

		switch (cOperator) {
		case '+':
			iRetValue = iFirstOperand + iSecondOperand;
			break;

		case '-':
			iRetValue = iFirstOperand - iSecondOperand;
			break;

		case '*':
			iRetValue = iFirstOperand * iSecondOperand;
			break;

		case '/':
			iRetValue = iFirstOperand / iSecondOperand;
			break;

		default:
			System.out.println("������ ���� �ʽ��ϴ�.");
			System.exit(0);
		}

		System.out.printf("��� ���� %d�Դϴ�", iRetValue);
		System.exit(0);
	}

}
