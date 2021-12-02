package javabook.ch04;

public class WrapperExam {
	int num1;
	String num2;
	
	public void go() {
		num1 = 20;
		num2 = "30";
		System.out.println(num1 + num2);
		
		
		// Wrapper Class 를 이용하여 문자열 타입의 값을 int 타입으로 반환
		int num3 = Integer.parseInt(num2);
		System.out.println(num1 + num3);
	}
	
	public static void main(String[] args) {
		WrapperExam we = new WrapperExam();
		we.go();
		
		

	}

}
