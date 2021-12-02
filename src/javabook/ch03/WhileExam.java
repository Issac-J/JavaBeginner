package javabook.ch03;

import java.io.*;

public class WhileExam {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long lFactNum = 0, lIncreaseNum = 1, lRetValue = 0;
		
		System.out.println("구하고 싶은 20미만의 팩토리얼을 입력하시오.");
		
		lFactNum = Long.parseLong(in.readLine());		
		
		if(lFactNum >= 20) {
			System.out.println("너무 큰 수를 입력하셨습니다.");
			System.exit(0);
		}
		
		lRetValue = lIncreaseNum;
		
		while(lFactNum > lIncreaseNum) {
			lRetValue *= ++lIncreaseNum;
		}
		System.out.printf("팩토리얼 값은 %d입니다.", lRetValue);
		System.exit(0);
	
		
	}

}
