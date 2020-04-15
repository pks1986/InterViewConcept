package synchronization;
class Thread17 extends Thread{
	Thread17(String n){
		super(n);
	}
	public void run(){
		if(Thread.interrupted()){
			System.out.println("Interrupted Thread's Code" + currentThread());
		}
		else{
			System.out.println("Non-Interrupted Thread's Code" + currentThread());
		}
	}
}
public class InterruptedEx {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread17 t17 = new Thread17("One");
		Thread17 t117 = new Thread17("Two");
		
		//t17.interrupt();
		t17.start();
		t17.interrupt();
		
		t117.start();
	}

}
