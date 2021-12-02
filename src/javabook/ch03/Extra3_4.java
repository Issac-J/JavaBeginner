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
		System.out.print("1에서 100까지 더하는 중");
		System.out.print("10의 모듈러 값이 3과 5인 값을 더한");
		System.out.print("결과 값은 " + iSum2 + "입니다.");
	}

}
