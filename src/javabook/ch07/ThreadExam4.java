package javabook.ch07;

// runnable Instance�� ��ӹ޾� Thread Ŭ���� ����
class Thread_Ex4 implements Runnable {
		
	public void run() {
		try {
			for(int i=1; i<=10; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��: " + i + "*" + i + "=" + (i*i));
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam4 {
	
	public static void main(String[] args) {
		// Runnable �������̽� �ν��Ͻ� ����
		Thread_Ex4 thread = new Thread_Ex4();
		
		// �ν��Ͻ��� ������ �������̽��� Thread Ŭ������ �̿��Ͽ� �ٽ� �ν��Ͻ� ����
		Thread obj = new Thread(thread);
		
		obj.start();
	}

}
