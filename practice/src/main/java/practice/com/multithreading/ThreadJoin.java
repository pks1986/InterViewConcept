package practice.com.multithreading;

public class ThreadJoin {

	public ThreadJoin() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new MyRunnable(),"t1");
		Thread t2 = new Thread(new MyRunnable(),"t2");
		Thread t3 = new Thread(new MyRunnable(),"t3");
		t1.start();
		try
		{
			t1.join(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
		try
		{
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All threads are dead, exiting main thread");
	}

}

class MyRunnable implements Runnable{

	public void run() {
		
		System.out.println("Thread Started ::"+ Thread.currentThread().getName());
		
		try
		{
			Thread.sleep(4000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Thread Ended ::"+ Thread.currentThread().getName());
	}
	
}
