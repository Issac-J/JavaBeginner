package javabook.ch07;

// Thread Class ����
class Thread_Ex1 extends Thread {
	
	// Thread Ŭ������ �߻� �޼ҵ�� �ݵ�� ����
	// Thread �����Ҷ�, �ڵ�ȣ��
	public void run() {
		try {
			for(int i=1; i<=10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��: " + i + " * " + i + " = " + (i*i));
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

// Thread ������ ���� Class
public class ThreadExam1 {
	
	// main method
	public static void main(String[] args) {
		
		// Thread Instance �� ����
		Thread_Ex1 thread = new Thread_Ex1();
		
		// Thread ���� 
		thread.start();
		
		System.out.println("Thread ���� ���� ���� �ڵ� ���� Ȯ��!!");

	}

}
