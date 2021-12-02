package javabook.ch03;

import java.io.*;

public class Extra3_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		char cTemp = '\0', cCompChar = 'a';
		int iStrLength = 0, iStrCount = 0, iCompCharCount = 0;
		String strInputData = "\0";
		
		System.out.println("문자열을 입력하시오.");
		
		strInputData = in.readLine();
		// 입력한 문자열을 받아서 strInputData에 저장
		
		iStrLength = strInputData.length();
		// 입력 받은 문자열의 길이를 iStrLength에 저장
		// String Method : length()
		
		while(iStrCount < iStrLength) {
			cTemp = strInputData.charAt(iStrCount);
			// String Method: charAt
			// charAt(arg) : 인자 argument 문자열의 글자 한 개씩 받아온다. 
			
			if(cTemp == cCompChar) {
				iCompCharCount++;
			}
			iStrCount++;
		}
		
		System.out.printf("문자있는 '%c' 의 개수는 %d 입니다.", cCompChar, iCompCharCount);
	}

}
