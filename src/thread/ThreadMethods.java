package thread;

public class ThreadMethods {
 
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is Runnning");
	}
	

	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
     Thread thread = new Thread();
     thread.start();
     thread.run();
     System.out.println("Thread is Started...");
     if(thread.isAlive()) {
    	 System.out.println(thread.getState());
    	
     }
     else {
    	 System.out.println("Thraed is Terminated..");
     }
	}

}
