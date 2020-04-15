package threading;
class Threadt1 extends Thread{
	Threadt1(String n){
		super(n);
		start();
	}
	public void run(){
		String name = currentThread().getName();
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(name + i);
				sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Threadt2 extends Thread{
	Threadt2(String n){
		super(n);
		start();
	}
	public void run(){
		String name = currentThread().getName();
		Threadt1 t1 = new Threadt1("First");
		try {
			t1.join(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(name + i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class JoinExample2 extends Thread{
	
	public static void main(String[] args) {
		String th = currentThread().getName();
		Threadt2 t2 = new Threadt2("Second");
		System.out.println("Hello 1");
		try {
			t2.join(500);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("Hello 2");
		try {
			for(int i = 0; i < 5; i++){
				System.out.println(th + i);
				sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello 3");

	}

}