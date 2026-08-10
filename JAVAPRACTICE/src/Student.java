public class Student {

	int s = 1;
	int m = 100;

	public synchronized void printeven() throws InterruptedException {
		while (s <= m) {
			if (s % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + s++);
				notify();
			} else {
				wait();
			}

		}
	}

	public synchronized void printodd() throws InterruptedException {
		while (s <= m) {
			if (s % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + s++);
				notify();
			} else {
				wait();
			}

		}
	}

	public static void main(String[] args) {
		Student student = new Student();
		
		
		 new Thread(()->{
			try {
				student.printeven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		 new Thread(()->{
				try {
					student.printodd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}).start();
		
		
	}

}
