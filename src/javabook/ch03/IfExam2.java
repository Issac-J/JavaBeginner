package javabook.ch03;

import java.io.*;

public class IfExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;

		System.out.println("������ �Է��Ͻÿ�.");

		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("10���� ���� ������: " + iRetValue);

		if (iRetValue == 5) {
			iVariable = 0;
			System.out.println(iVariable);
			System.exit(0);
			// System.exit(0) �� �����Ǹ� if �� ���� �ڵ嵵 ����ȴ�.
		}
		iVariable++;
		System.out.println(iVariable);
	}

}
