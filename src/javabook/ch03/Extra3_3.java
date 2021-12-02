package javabook.ch03;

import java.io.*;

public class Extra3_3 {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int iFirstOperand = 0, iSecondOperand = 0, iRetValue = 0;
		char cOperator = 0;
		
		System.out.println("첫 번째 수를 입력하시오.");
		iFirstOperand = Integer.parseInt(in.readLine());
		
		System.out.println("연산자를 입력하시오. [+, -, *, /]");
		cOperator = (char)System.in.read();
		System.in.read();
		System.in.read();
		
		System.out.println("두 번째 수를 입력하시오.");
		iSecondOperand = Integer.parseInt(in.readLine());
		
		if(cOperator == '+') {
			iRetValue = iFirstOperand + iSecondOperand;
		} else if(cOperator == '-') {
			iRetValue = iFirstOperand - iSecondOperand;
		} else if(cOperator == '*') {
			iRetValue = iFirstOperand * iSecondOperand;
		} else if(cOperator == '/') {
			iRetValue = iFirstOperand / iSecondOperand;
		} else {
			System.out.println("연산이 되지 않습니다.");
			System.exit(0);
		}
		System.out.printf("결과 값은 %d입니다.", iRetValue);
		System.exit(0);
	}

}
