package javabook.ch03;

import java.io.*;

public class WhileExam {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		long lFactNum = 0, lIncreaseNum = 1, lRetValue = 0;
		
		System.out.println("���ϰ� ���� 20�̸��� ���丮���� �Է��Ͻÿ�.");
		
		lFactNum = Long.parseLong(in.readLine());		
		
		if(lFactNum >= 20) {
			System.out.println("�ʹ� ū ���� �Է��ϼ̽��ϴ�.");
			System.exit(0);
		}
		
		lRetValue = lIncreaseNum;
		
		while(lFactNum > lIncreaseNum) {
			lRetValue *= ++lIncreaseNum;
		}
		System.out.printf("���丮�� ���� %d�Դϴ�.", lRetValue);
		System.exit(0);
	
		
	}

}
