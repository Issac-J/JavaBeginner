package javabook.ch07;

// runnable Instance를 상속받아 Thread 클래스 정의
class Thread_Ex4 implements Runnable {
		
	public void run() {
		try {
			for(int i=1; i<=10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번: " + i + "*" + i + "=" + (i*i));
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam4 {
	
	public static void main(String[] args) {
		// Runnable 인터페이스 인스턴스 생성
		Thread_Ex4 thread = new Thread_Ex4();
		
		// 인스턴스가 생성된 인터페이스를 Thread 클래스를 이용하여 다시 인스턴스 생성
		Thread obj = new Thread(thread);
		
		obj.start();
	}

}
