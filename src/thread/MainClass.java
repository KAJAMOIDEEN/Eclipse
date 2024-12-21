package thread;

public class MainClass implements Runnable {
	Thread j;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			j.sleep(5000);
			System.out.println("Thread is Runnning");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String args[]) {
		MainClass obj = new MainClass();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("Thread is Started...");

	}

}
