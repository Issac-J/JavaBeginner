package javabook.ch03;

import java.io.*;

public class IfExam5 {

	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iVariable = 0, iRetValue = 0;
		
		System.out.println("정수를 입력하시오.");
		iVariable = Integer.parseInt(in.readLine());
		iRetValue = iVariable % 10;
		System.out.println("10으로 나눈 나머지: " + iRetValue);
		
		if(iRetValue > 3) {
			iRetValue = iRetValue % 7;
			System.out.println(iRetValue);
			if(iRetValue < 5) System.out.println("5에 접근했다.");
			else System.out.println("7에 접근했다.");
		} else {
			System.out.println("3에 접근했다.");
		}		
	}
}
