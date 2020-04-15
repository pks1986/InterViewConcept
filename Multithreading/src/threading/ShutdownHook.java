package threading;
class Thread4 extends Thread{
	public void run(){
		System.out.println("Shut Down Hook Task Completed");
	}
}

class Thread5 extends Thread{
	public void run(){
		try {
			for(int i =0; i<10;i++){
				System.out.println(i);
				Thread.sleep(1000);
				if(i==7){
					System.exit(0);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ShutdownHook {
	
	//Ctrl + C working in command prompt

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime r = Runtime.getRuntime();
		System.out.println(r);
		r.addShutdownHook(new Thread4());
		System.out.println("Now main sleeping... Press Ctrl + C to exit");

		Thread t = new Thread5();
		t.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main Code After Interruption");
	}
}