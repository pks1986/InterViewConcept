package java8.methodreference;

public class UsingThreadRunnable {

	public static void RunMethodImplementation(){
		System.out.println("Runnable run()implementation");
	}
	
	public static void main(String args[]) {
		Thread thread = new Thread(UsingThreadRunnable::RunMethodImplementation);
		thread.start();
	}
}
