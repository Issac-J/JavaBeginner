package javabook.ch07;

class Thread_Ex5 extends Thread {
	int m_iRandomNum;
	
	public Thread_Ex5(String name) {
		super(name);
	}
	
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				m_iRandomNum = (int)(Math.random() * 100);
				System.out.println(getName() + " : " + m_iRandomNum);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam5 {

	public static void main(String[] args) {
		Thread_Ex5 thread1 = new Thread_Ex5("Thread1");
		Thread_Ex5 thread2 = new Thread_Ex5("Thread1");
		Thread_Ex5 thread3 = new Thread_Ex5("Thread1");
		
		System.out.println("각 Thread의 랜덤 값을 출력합니다.");
		
		thread1.start();
		thread2.start();
		thread3.start();
		

	}

}
