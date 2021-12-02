package javabook.ch07;

class Thread_Ex2 extends Thread{
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "�� Thread");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}

public class ThreadExam2 {

	public static void main(String[] args) {
		// try ���� �̿��� ���� ó��
		try {
			// Thread Instance ����
			Thread_Ex2 thread = new Thread_Ex2();
			thread.start();
			
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i + "��: main �޼ҵ�");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
