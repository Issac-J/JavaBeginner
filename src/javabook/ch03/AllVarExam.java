package javabook.ch03;

public class AllVarExam {

	public static void main(String[] args) {
		byte bByteType = '{';
		short sShortType = '}';
		int nIntType = 2147483647;
		long lLongType = 9876543210L;
		
		System.out.printf("bByteType의 문자형 결과 = %c\r\n", bByteType);
		System.out.printf("bByteType의 정수형 결과 = %d\r\n", bByteType);
		
		System.out.printf("sShortType의 문자형 결과 = %c\r\n", sShortType);
		System.out.printf("sShortType의 정수형 결과 = %d\r\n", sShortType);
		
		System.out.printf("nIntType의 정수형 결과 = %d\r\n", nIntType);
		System.out.printf("lLongType의 정수형 결과 = %d\r\n", lLongType);
		
	}	

}
