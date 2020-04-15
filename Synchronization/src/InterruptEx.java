class Thread16 extends Thread{
	public void run(){
		System.out.println("Task 1 Completed");
		try {
			sleep(2000);
			System.out.println("Task 2 completed");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread is still running");
	}	
}
public class InterruptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread16 t16 = new Thread16();
		try {
			t16.start();
			t16.interrupt();
		} catch (RuntimeException e) {
			
		}
		
	}

}
