package javabook.ch03;

import java.io.*;

public class Extra3_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;

		System.out.println("������ �Է��Ͻÿ�.");
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("�Է��� ���� �������� 3�� 5 ������ ���ΰ�?");

		if (iRetValue > 3 && iRetValue < 5) {
			System.out.println("��. �׷����ϴ�.");
		} else {
			System.out.println("�ƴϿ�. �׷��� �ʽ��ϴ�.");
		}
		System.out.println("�������� " + iRetValue);
	}

}
