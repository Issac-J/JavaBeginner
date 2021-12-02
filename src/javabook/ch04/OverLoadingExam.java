package javabook.ch04;

public class OverLoadingExam {
	
	int color;
	String strColor;
	
	void setColor(int color) {
		this.color = color;
	}
	
	void setColor(String color) {
		this.strColor = color;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExam ole = new OverLoadingExam();
		
		ole.setColor(20);
		ole.setColor("Red");
		
		System.out.println("ÄÃ·¯: " + ole.color + ", " + ole.strColor);
	}

}
