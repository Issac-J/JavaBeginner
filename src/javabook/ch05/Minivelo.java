package javabook.ch05;

public class Minivelo implements IBicycle {
	
	// 멤버 변수 선언
	int id;
	String brand;
	
	// 오버라이딩을 이용한 추상 메소드
	public void prtInfo() {
		System.out.println("ID : " + id);
		System.out.println("Brand : " + brand);
		System.out.println("Frame Size : " + IBicycle.FrameSize_M);	// 인터페이스에서 제공하는 상수 사용 (FrameSize_M)
	}

	public static void main(String[] args) {
		Minivelo mv = new Minivelo();
		mv.id = 200;
		mv.brand = "Dahon";
		mv.prtInfo();
	}
}
