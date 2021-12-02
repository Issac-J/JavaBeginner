package javabook.ch04;

public class ObjExam1 {
	
	String name;	// name 이라는 변수를 string 타입으로 선언
//	String name = new String();
	
	public void prtName() {
		System.out.println("이름: " + name);
	}

	public static void main(String[] args) {
		ObjExam1 obj1 = new ObjExam1();		// ObjExam1 클래스 인스턴스를 생성
		obj1.prtName();						// null 값이 할당된다. 
		obj1.name = "홍길동";					// 참조변수를 이용하여 인스턴스 변수 값을 설정
		obj1.prtName();						// 참조변수를 이용하여 인스턴스 변수 출력
	}

}
