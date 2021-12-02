package javabook.ch03;

import java.io.*;

public class Extra3_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;

		System.out.println("정수를 입력하시오.");
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("입력한 수의 나머지가 3과 5 사이의 수인가?");

		if (iRetValue > 3 && iRetValue < 5) {
			System.out.println("예. 그렇습니다.");
		} else {
			System.out.println("아니오. 그렇지 않습니다.");
		}
		System.out.println("나머지는 " + iRetValue);
	}

}
