package threading;
class NewThread implements Runnable{
	
	public void run(){
		System.out.println(Thread.currentThread());
		for(int i = 0; i < 6; i ++){
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ExtendThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewThread ob = new NewThread();
		Thread t1 = new Thread(ob, "New Thread");
		t1.start();
	}
}
