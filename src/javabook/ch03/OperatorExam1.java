package javabook.ch03;

public class OperatorExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long lRetValue = 0;
		double dRetValue = 0, dOperand = 1.1;	
		// Operand : 피연산자
		
		int nC;
		double dC;
		
		nC = 5 / 2;
		System.out.println(nC);		// Output: 2
		
		dC = 5.0 / 2;
		System.out.println(dC);		// Output: 2.5
		
		nC = 10000000 * 10000000;
		System.out.println(nC);		// Output: 276447232
		
		nC = -10000000 * 10000000;
		System.out.println(nC);		// Output: -276447232
		
		
		dRetValue = dOperand + dOperand;
		System.out.println(dRetValue);
		
		dRetValue = dOperand - dOperand;
		System.out.println(dRetValue);
		
		lRetValue = 100 * 1000;
		System.out.println(lRetValue);
		
		dRetValue = 1 / 100d;
		System.out.println(dRetValue);		
	}	
}
