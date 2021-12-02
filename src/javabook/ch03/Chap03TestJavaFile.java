package javabook.ch03;

class Phone {
	double PhoneVersion;
	double size;
	double weight;
}

public class Chap03TestJavaFile {	

	public static void main(String[] args) {
		
		Phone myPhone = new Phone();
		myPhone.PhoneVersion = 6.0;
		myPhone.size = 6.7;
		myPhone.weight = 1.5;
		
		Phone yourPhone = new Phone();
		yourPhone.PhoneVersion = 8.0;
		yourPhone.size = 5.7;
		yourPhone.weight = 1.3;

		System.out.println("myPhoneVersion: " + myPhone.PhoneVersion);
		System.out.println("myPhoneSize: " + myPhone.size);
		
		System.out.println("yourPhoneVersion: " + yourPhone.PhoneVersion);
		System.out.println("yourPhoneSize: " + yourPhone.size);
		
		yourPhone = myPhone;
		
		System.out.println("myPhoneVersion: " + myPhone.PhoneVersion);
		System.out.println("myPhoneSize: " + myPhone.size);
		
		System.out.println("yourPhoneVersion: " + yourPhone.PhoneVersion);
		System.out.println("yourPhoneSize: " + yourPhone.size);
		
	}

}
