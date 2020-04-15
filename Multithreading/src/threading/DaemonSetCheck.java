package threading;
class DaemonThread extends Thread{
	public void run(){
		if(currentThread().isDaemon()){
			System.out.println("Daemon Thread");
		}
		else{
			System.out.println("User Thread");
		}
	}
}

public class DaemonSetCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		Thread t3 = new DaemonThread();
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();

	}

}
