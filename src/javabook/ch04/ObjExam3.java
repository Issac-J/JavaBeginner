package javabook.ch04;

public class ObjExam3 {
	
	String name = "-";	// Instance Variable
	static int num = 0;	// Class Variable ('static' keyword means class Variable)
	
	public void prtVars() {
		
		System.out.println("��ȣ: " + num);
		System.out.println("�̸�: " + name);
	}

	public static void main(String[] args) {
	
		ObjExam3 obj1 = new ObjExam3();	// ObjExam03 Ŭ������ �̿��Ͽ� obj1 �ν��Ͻ��� ����
		obj1.name = "�Ӳ���";
		ObjExam3.num = 100;
		
		ObjExam3 obj2 = new ObjExam3();
		obj2.name = "�̼���";
		
		System.out.println("== �ν��Ͻ������� �̿��� ���� �� ��� ==");
		obj1.prtVars();
		obj2.prtVars();	// obj2.num ��  �������� �ʾ������� obj1���� ������ ��(100)�� ��µȴ�.
		
		System.out.println("== static ���� �� ���� �� ��� ==");
		
		ObjExam3.num = 200;
		
		obj1.prtVars();
		obj2.prtVars();
		
	}

}
