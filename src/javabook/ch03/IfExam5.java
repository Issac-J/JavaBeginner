package javabook.ch03;

import java.io.*;

public class IfExam5 {

	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;
		
		System.out.println("������ �Է��Ͻÿ�.");
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("10���� ���� ������: " + iRetValue);
		
		if(iRetValue > 3) {
			iRetValue = iRetValue % 7;
			System.out.println(iRetValue);
			if(iRetValue < 5) System.out.println("5�� �����ߴ�.");
			else System.out.println("7�� �����ߴ�.");
		} else {
			System.out.println("3�� �����ߴ�.");
		}		
	}
}
