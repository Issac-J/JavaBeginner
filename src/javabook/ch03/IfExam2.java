package javabook.ch03;

import java.io.*;

public class IfExam2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;

		System.out.println("정수를 입력하시오.");

		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("10으로 나눈 나머지: " + iRetValue);

		if (iRetValue == 5) {
			iVariable = 0;
			System.out.println(iVariable);
			System.exit(0);
			// System.exit(0) 이 생략되면 if 문 밖의 코드도 실행된다.
		}
		iVariable++;
		System.out.println(iVariable);
	}

}
