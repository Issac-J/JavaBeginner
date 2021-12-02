package javabook.ch04;

public class Extra4_3 {
	
	String brand;
	String model;
	
	public void prtInfo() {
		System.out.println("brand: " + brand);
		System.out.println("model: " + model);
	}
	
	public Extra4_3() {
		brand = "미설정";
		model = "미설정";
	}
	
	public Extra4_3(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Extra4_3 e1 = new Extra4_3();
		Extra4_3 e2 = new Extra4_3("scott", "scale30");
		
		e1.prtInfo();
		e2.prtInfo();

	}

}
