package javabook.ch07;

class Thread_Ex2 extends Thread{
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번 Thread");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam2 {

	public static void main(String[] args) {
		// try 문을 이용해 오류 처리
		try {
			// Thread Instance 생성
			Thread_Ex2 thread = new Thread_Ex2();
			thread.start();
			
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번: main 메소드");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
