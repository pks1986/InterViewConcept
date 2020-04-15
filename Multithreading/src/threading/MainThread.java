package threading;

public class MainThread {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		
		try {
			for(int i = 5; i > 0; i--){
				System.out.println(t);
				System.out.println(i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			// TODO Auto-generated catch block
			System.out.println(ie);
		}
	}

}
