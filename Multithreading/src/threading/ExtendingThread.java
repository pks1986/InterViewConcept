package threading;

public class ExtendingThread extends Thread{
	ExtendingThread(String n){
		super(n);
		start();
		//start();
	}
	
	public void run(){
		String s = currentThread().getName();
		long id = currentThread().getId();
		System.out.println(id);
		try {
			for(int i = 0; i < 6; i++){
				System.out.println(s + " " + i);
				sleep(2000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExtendingThread("One");
		new ExtendingThread("Two");
		new ExtendingThread("Three");
		
		
		try {
				Thread.sleep(1000);
		} catch (InterruptedException ie) {
			// TODO Auto-generated catch block
			System.out.println(ie);
		}
	}

}
