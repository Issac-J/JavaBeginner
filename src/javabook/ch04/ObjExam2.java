package javabook.ch04;

public class ObjExam2 {
	
	String name;
	int num;
	int age;
	
	public ObjExam2() {
		name = "ȫ�浿";
		num = 90;
	}
	
	public ObjExam2(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	public void prtVars() {
		System.out.println("��ȣ: " + num);
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
	}
	
	public static void main(String[] args) {
		// 
		ObjExam2 obj1 = new ObjExam2();
		ObjExam2 obj2 = new ObjExam2(220, "�ƹ���", 30);
		
		obj1.prtVars();
		obj2.prtVars();

	}

}
