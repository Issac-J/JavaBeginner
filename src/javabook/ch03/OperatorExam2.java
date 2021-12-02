package javabook.ch03;

public class OperatorExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bOperand = 10;
		short sOperand = 20;
		int iOperand = 10;
		long lOperand = 30L;
		double dOperand = 2.5;
		int iRetValue1 = 0, iRetValue2 = 0;
		long lRetValue = 0L;
		double dRetValue = 0;
		
		iRetValue1 = bOperand * sOperand;	// 10 * 20
		iRetValue2 = sOperand / iOperand;	// 20 / 10
		lRetValue = iOperand * lOperand;	// 10 * 30L
		dRetValue = iOperand / dOperand;	// 10 / 2.5
		
		System.out.println(iRetValue1);		// Output: 200
		System.out.println(iRetValue2);		// Output: 2
		System.out.println(lRetValue);		// Output: 300
		System.out.println(dRetValue);		// Output: 4.0		
	}

}
