package javabook.ch07;

// Thread Class 선언
class Thread_Ex1 extends Thread {
	
	// Thread 클래스의 추상 메소드로 반드시 구현
	// Thread 시작할때, 자동호출
	public void run() {
		try {
			for(int i=1; i<=10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번: " + i + " * " + i + " = " + (i*i));
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

// Thread 실행을 위한 Class
public class ThreadExam1 {
	
	// main method
	public static void main(String[] args) {
		
		// Thread Instance 를 생성
		Thread_Ex1 thread = new Thread_Ex1();
		
		// Thread 시작 
		thread.start();
		
		System.out.println("Thread 종료 전에 다음 코드 실행 확인!!");

	}

}
