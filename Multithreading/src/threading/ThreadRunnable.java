package threading;

public class ThreadRunnable implements Runnable{
	Thread t;
	ThreadRunnable(String n){
		t = new Thread(this, n);
		
		t.start();
				
	}
	
	public void run(){
		System.out.println(Thread.currentThread());
		try {
			for(int i = 0; i <= 5; i ++){
				System.out.println("Run: ");
				System.out.println(i);
				Thread.sleep(1000);
				
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadRunnable("Demo Thread");
		
		try {
			for(int i = 5; i > 0; i--){
				System.out.println("Main: ");
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			// TODO Auto-generated catch block
			System.out.println(ie);
		}

	}

}
