package javabook.ch07;

class Thread_Ex3 extends Thread {
	
	public Thread_Ex3(String name) {
		super(name);	
	}
	
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "번: " + getName() + "Thread");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_Ex3 thread01 = new Thread_Ex3("첫 번째");
		Thread_Ex3 thread02 = new Thread_Ex3("두 번째");
		Thread_Ex3 thread03 = new Thread_Ex3("세 번째");
		
		thread01.start();
		thread02.start();
		thread03.start();
	}
}
