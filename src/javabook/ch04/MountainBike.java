package javabook.ch04;

// 처음으로 MountainBike.java 를 생성했을 때, Error 가 발생한다.
// 그 이유는 superClass 에서 만든 생성자를 구현하지 않았기 때문이다. 
public class MountainBike extends BicycleClass {

	// MountainBike 전용 멤버변수를 선언
	String frame;
	boolean suspension;
	
	public MountainBike(int id, String brand) {
		super(id, brand);
	}
	
	public void prtInfo() {
		System.out.println("id: " + id);
		System.out.println("brand: " + brand);
		System.out.println("suspension: " + suspension);
		System.out.println("frame: " + frame);
		System.out.println("==================================");
	}
	
	public static void main(String[] args) {
		
		MountainBike mtb0 = new MountainBike(20091098, null);
		MountainBike mtb1 = new MountainBike(20091098, "scott");
		
		mtb1.frame = "Carbon";
		mtb1.suspension = true;
			
		mtb0.prtInfo();
		mtb1.prtInfo();
		
	}
}
