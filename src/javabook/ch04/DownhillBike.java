package javabook.ch04;

public class DownhillBike extends MountainBike {	

	public DownhillBike(int id, String brand) {
		super(id, brand);

	}
	
	public void prtInfo() {
		System.out.println("=== DownhillBike ===");
		System.out.println("brand: " + brand);
		System.out.println("frame: " + frame);
		System.out.println("suspension: " + suspension);
	}

	public static void main(String[] args) {
		DownhillBike db = new DownhillBike(300, "Kona");
		db.frame = "Aluminum";
		db.suspension = true;
		db.prtInfo();
	}
}
