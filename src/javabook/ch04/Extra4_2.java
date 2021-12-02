package javabook.ch04;

public class Extra4_2 extends BicycleClass {
	
	int wheelSize = 20;	// Extra4_2 전용 멤버변수 선언

	public Extra4_2(int id, String brand) {
		super(id, brand);
		// TODO Auto-generated constructor stub
	}
	
	public void prtInfo() {
		System.out.println("brand: " + brand);
		System.out.println("wheelSize: " + wheelSize);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extra4_2 obj = new Extra4_2(20091098, "Dahon");
		obj.prtInfo();

	}

}
