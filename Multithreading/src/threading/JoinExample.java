package threading;
class Thread1 extends Thread{
	Thread1(String n){
		super(n);
		start();
	}
	public void run(){
		String name = currentThread().getName();
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(name + " " + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread{
	Thread2(String n){
		super(n);
		start();
	}
	public void run(){
		String name = currentThread().getName();
		Thread1 t1 = new Thread1("First");
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(name + " " + i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class JoinExample extends Thread{
	
	public static void main(String[] args) {
		String th = currentThread().getName();
		Thread2 t2 = new Thread2("Second");
		System.out.println("Hello 1");
		try {
			t2.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Hello 2");
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(th + " " + i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello 3");

	}

}
