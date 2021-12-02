package javabook.ch04;

// ó������ MountainBike.java �� �������� ��, Error �� �߻��Ѵ�.
// �� ������ superClass ���� ���� �����ڸ� �������� �ʾұ� �����̴�. 
public class MountainBike extends BicycleClass {

	// MountainBike ���� ��������� ����
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
