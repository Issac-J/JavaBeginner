package javabook.ch03;

public class OperatorExam5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iOperand1 = 10, iOperand2 = 20, iOperand3 = 10;
		boolean retValue = true;
		
		retValue = iOperand1 > iOperand2;	// 10 > 20 
		System.out.println(retValue);		// Output: false
		
		retValue = iOperand1 < iOperand2;	// 10 < 20 
		System.out.println(retValue);		// Output: true
		
		retValue = iOperand1 >= iOperand2;	// 10 >= 20 
		System.out.println(retValue);		// Output: false
		
		retValue = iOperand1 + iOperand3 <= iOperand2;	// 10 + 10 <= 20 
		System.out.println(retValue);		// Output: true
		
		retValue = iOperand1 == iOperand2;	// 10 == 20 
		System.out.println(retValue);		// Output: false
		
		retValue = iOperand1 != iOperand2;	// 10 != 20 
		System.out.println(retValue);		// Output: true
		
	}

}
