package javabook.ch03;

public class Extra3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iCount = 0, iSum1 = 0, iSum2 = 0, iMod = 0;
		
		for(iCount = 1; iCount <= 100; iCount++) {
			iSum1 += iCount;
			iMod = iSum1 % 10;
			if(iMod == 3 || iMod == 5) {
				iSum2 += iSum1;
			}
		}
		System.out.print("1���� 100���� ���ϴ� ��");
		System.out.print("10�� ��ⷯ ���� 3�� 5�� ���� ����");
		System.out.print("��� ���� " + iSum2 + "�Դϴ�.");
	}

}
