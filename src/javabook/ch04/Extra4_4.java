package javabook.ch04;

public class Extra4_4 extends ObjExam1 {
	
	public void prtName() {
		System.out.println("Name: " + name + "입니다.");
	}
	
	public static void main(String[] args) {
		Extra4_4 e = new Extra4_4();
		e.name = "홍길동";
		e.prtName();
		

	}

}
