package javabook.ch03;

import java.io.*;

public class Extra3_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		char cTemp = '\0', cCompChar = 'a';
		int iStrLength = 0, iStrCount = 0, iCompCharCount = 0;
		String strInputData = "\0";
		
		System.out.println("���ڿ��� �Է��Ͻÿ�.");
		
		strInputData = in.readLine();
		// �Է��� ���ڿ��� �޾Ƽ� strInputData�� ����
		
		iStrLength = strInputData.length();
		// �Է� ���� ���ڿ��� ���̸� iStrLength�� ����
		// String Method : length()
		
		while(iStrCount < iStrLength) {
			cTemp = strInputData.charAt(iStrCount);
			// String Method: charAt
			// charAt(arg) : ���� argument ���ڿ��� ���� �� ���� �޾ƿ´�. 
			
			if(cTemp == cCompChar) {
				iCompCharCount++;
			}
			iStrCount++;
		}
		
		System.out.printf("�����ִ� '%c' �� ������ %d �Դϴ�.", cCompChar, iCompCharCount);
	}

}
