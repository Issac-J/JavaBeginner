package javabook.ch03;

public class ForExam {

	public static void main(String[] args) {
		int iLowValue = 1, iHighValue = 100, iCount = 0, iRetValue = 0;
		
		for(iCount = iLowValue; iCount<=iHighValue; iCount++) {
			iRetValue += iCount;
		}
		System.out.println("1에서 100까지 더한 값: " + iRetValue);
		
	}

}
