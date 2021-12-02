package javabook.ch03;

import java.io.*;

public class IfExam1 {

	public static void main(String[] args) throws IOException {
		// throws IOException 클래스는 main 문에서 입출력 예외가 발생하면 처리

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader 클래스는 키보드 입출력 처리

		int iVariable = 0, iRetValue = 0;

		System.out.println("정수를 입력하시오.");

		iVariable = Integer.parseInt(in.readLine());
		// in.readLine() 으로 키보드 값을 읽은 뒤 Integer.parseInt 메소드를 이용하여 입력한 값을 정수로 변환

		iRetValue = iVariable % 10;

		System.out.println("10으로 나눈 나머지: " + iRetValue);

		if (iRetValue == 5)
			iVariable = 0;
		if (iRetValue != 5)
			iVariable++;

		System.out.println(iVariable);

	}

}
