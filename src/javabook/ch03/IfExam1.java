package javabook.ch03;

import java.io.*;

public class IfExam1 {

	public static void main(String[] args) throws IOException {
		// throws IOException Ŭ������ main ������ ����� ���ܰ� �߻��ϸ� ó��

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader Ŭ������ Ű���� ����� ó��

		int iVariable = 0, iRetValue = 0;

		System.out.println("������ �Է��Ͻÿ�.");

		iVariable = Integer.parseInt(in.readLine());
		// in.readLine() ���� Ű���� ���� ���� �� Integer.parseInt �޼ҵ带 �̿��Ͽ� �Է��� ���� ������ ��ȯ

		iRetValue = iVariable % 10;

		System.out.println("10���� ���� ������: " + iRetValue);

		if (iRetValue == 5)
			iVariable = 0;
		if (iRetValue != 5)
			iVariable++;

		System.out.println(iVariable);

	}

}
