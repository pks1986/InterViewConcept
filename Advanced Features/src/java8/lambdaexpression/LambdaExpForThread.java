package java8.lambdaexpression;

public class LambdaExpForThread {
	
	public static void main(String[] args) {
		
		new Thread(new Runnable() {	
			@Override
			public void run() {
				System.out.println("Thread Without Lambda");
			}
		}).start();;
		
		Runnable runnable = ()->{
			System.out.println("Thread with Lambda Expression");
		};
		new Thread(runnable).start();
		
	}
}
