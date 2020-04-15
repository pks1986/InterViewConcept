package synchronization;
//Deadlock is not occuring in this program, don't know why
class Shared{
	static String resource1 = "CPU";
	static String resource2 = "IO";
}
class Thread11 extends Thread{
	
	public void run(){
		synchronized (Shared.resource1){
			System.out.println("Thread1: " +Shared.resource1);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized (Shared.resource2){
			System.out.println("Thread1: " +Shared.resource2);
		}
	}
}

class Thread12 extends Thread{
	
	public void run(){
		synchronized (Shared.resource2){
			System.out.println("Thread2: " +Shared.resource2);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		synchronized (Shared.resource1){
			System.out.println("Thread2: " +Shared.resource1);
		}
	}
}

public class DeadlockEx {
	public static void main(String[] args){
	//	Shared sh = new Shared();
		Thread11 t11 = new Thread11();
		Thread12 t12 = new Thread12();
		t11.start();
		t12.start();
	}
}