package javabook.ch03;

import java.io.*;

public class Extra3_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;
		System.out.println("정수를 입력하시오.");
		
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 30;
		System.out.println("입력한 수의 나머지를 확인하시오.");
		
		if(iRetValue == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		} else if(iRetValue > 1 && iRetValue < 10) {
			System.out.println("1 < X < 10 입니다.");
		} else if(iRetValue > 10 && iRetValue < 20) {
			System.out.println("10 < X < 20 입니다.");
		} else if(iRetValue > 20 && iRetValue < 30) {
			System.out.println("20 < X < 30 입니다.");
		}
		System.out.println("나머지는 " + iRetValue);
		
	}

}
