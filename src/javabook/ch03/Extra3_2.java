package javabook.ch03;

import java.io.*;

public class Extra3_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;
		System.out.println("������ �Է��Ͻÿ�.");
		
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 30;
		System.out.println("�Է��� ���� �������� Ȯ���Ͻÿ�.");
		
		if(iRetValue == 0) {
			System.out.println("�Է��� ���ڴ� 0�Դϴ�.");
		} else if(iRetValue > 1 && iRetValue < 10) {
			System.out.println("1 < X < 10 �Դϴ�.");
		} else if(iRetValue > 10 && iRetValue < 20) {
			System.out.println("10 < X < 20 �Դϴ�.");
		} else if(iRetValue > 20 && iRetValue < 30) {
			System.out.println("20 < X < 30 �Դϴ�.");
		}
		System.out.println("�������� " + iRetValue);
		
	}

}
