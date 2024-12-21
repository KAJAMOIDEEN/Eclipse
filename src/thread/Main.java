package thread;

public class Main extends Thread {

	public void run() {
		System.out.println("Thread is Runnning");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		obj.start();
		System.out.println("Thread is Started...");
	}

}
