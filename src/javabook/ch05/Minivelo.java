package javabook.ch05;

public class Minivelo implements IBicycle {
	
	// ��� ���� ����
	int id;
	String brand;
	
	// �������̵��� �̿��� �߻� �޼ҵ�
	public void prtInfo() {
		System.out.println("ID : " + id);
		System.out.println("Brand : " + brand);
		System.out.println("Frame Size : " + IBicycle.FrameSize_M);	// �������̽����� �����ϴ� ��� ��� (FrameSize_M)
	}

	public static void main(String[] args) {
		Minivelo mv = new Minivelo();
		mv.id = 200;
		mv.brand = "Dahon";
		mv.prtInfo();
	}
}
