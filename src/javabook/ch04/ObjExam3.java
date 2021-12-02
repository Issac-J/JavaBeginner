package javabook.ch04;

public class ObjExam3 {
	
	String name = "-";	// Instance Variable
	static int num = 0;	// Class Variable ('static' keyword means class Variable)
	
	public void prtVars() {
		
		System.out.println("번호: " + num);
		System.out.println("이름: " + name);
	}

	public static void main(String[] args) {
	
		ObjExam3 obj1 = new ObjExam3();	// ObjExam03 클래스를 이용하여 obj1 인스턴스를 생성
		obj1.name = "임꺽정";
		ObjExam3.num = 100;
		
		ObjExam3 obj2 = new ObjExam3();
		obj2.name = "이순신";
		
		System.out.println("== 인스턴스변수를 이용한 설정 값 출력 ==");
		obj1.prtVars();
		obj2.prtVars();	// obj2.num 을  설정하지 않았음에도 obj1에서 설정한 값(100)이 출력된다.
		
		System.out.println("== static 변수 값 변경 후 출력 ==");
		
		ObjExam3.num = 200;
		
		obj1.prtVars();
		obj2.prtVars();
		
	}

}
