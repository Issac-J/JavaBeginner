package javabook.ch05;

public class MotorBicycle implements IBicycle, IMotor {
	
	// 멤버 변수 선언
	int id;
	String brand;
	
	
	// IMotor에 있는 추상 메소드 구현(start 메소드 실체화)
	@Override
	public void start() {
		System.out.println("## Motor Start! ##");

	}

	// IMotor에 있는 추상 메소드 구현(stop 메소드 실체화)
	@Override
	public void stop() {
		System.out.println("## Motor Stop! ##");

	}

	@Override
	public void prtInfo() {
		System.out.println("ID : " + id);
		System.out.println("Brand : " + brand);
		System.out.println("FrameSize : " + IBicycle.FrameSize_M);
		System.out.println("MotorSize :" + IMotor.Motor_Size_Large);
	}
	
	public static void main(String[] args) {
		MotorBicycle Mb = new MotorBicycle();
		Mb.id = 90;
		Mb.brand = "Yamaha";
		Mb.prtInfo();
		Mb.start();
		Mb.stop();
	}
}
