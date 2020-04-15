package threading;
public class MyThread implements Runnable{
	Thread t;
	MyThread(){
		t = new Thread(this, "My Thread");
		t.start();
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			for (int i = 5; i < 0; i--){
				System.out.println(i);
				Thread.sleep(2000);
			}
		}catch(InterruptedException ie){
				System.out.println(ie);				
			}
		}
		
	public static void main(String[] args) {
		new MyThread();
	}

}
