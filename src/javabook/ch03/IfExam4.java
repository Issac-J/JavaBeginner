package javabook.ch03;

import java.io.*;

public class IfExam4 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;
		System.out.println("������ �Է��Ͻÿ�.");

		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("10���� ���� ������: " + iRetValue);

		if (iRetValue == 5) {
			iVariable = 0;
		} else if (iRetValue > 5) {
			iVariable--;
		} else {
			iVariable++;
		}
		System.out.println(iVariable);
	}
}
