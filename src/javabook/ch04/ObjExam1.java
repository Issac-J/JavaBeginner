package javabook.ch04;

public class ObjExam1 {
	
	String name;	// name �̶�� ������ string Ÿ������ ����
//	String name = new String();
	
	public void prtName() {
		System.out.println("�̸�: " + name);
	}

	public static void main(String[] args) {
		ObjExam1 obj1 = new ObjExam1();		// ObjExam1 Ŭ���� �ν��Ͻ��� ����
		obj1.prtName();						// null ���� �Ҵ�ȴ�. 
		obj1.name = "ȫ�浿";					// ���������� �̿��Ͽ� �ν��Ͻ� ���� ���� ����
		obj1.prtName();						// ���������� �̿��Ͽ� �ν��Ͻ� ���� ���
	}

}
