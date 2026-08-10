
public class A {
int s=1;
	int m = 100;

	public synchronized void  even() throws InterruptedException {

		while(s<=100) {
			if (s % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + s++);
				notify();
			} else {
				wait();
			}
		}

	}

	public synchronized void odd() throws InterruptedException {

		while(s<=100) {
			if (s % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + s++);
				notify();
			} else {
				wait();
			}
		}

	}
	public static void main(String[] args) {
		A a = new A();
		
		new Thread(()->{
			try {
				a.even();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();

		new Thread(()->{
			try {
				a.odd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
	}

}
