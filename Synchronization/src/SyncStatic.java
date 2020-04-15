class Table4{
	static synchronized void printTable(int n){
		for(int i = 1;  i <= 10; i++){
			System.out.print(n*i + "\t");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n");
	}
}

class Thread9 extends Thread{
	Table4 t;
	Thread9(Table4 t){
		this.t = t;
	}
	public void run(){
		t.printTable(50);		
	}
}

class Thread10 extends Thread{
	
	Table4 t;
	Thread10(Table4 t){
		this.t = t;
	}
	public void run(){
		t.printTable(100);		
	}
}

public class SyncStatic {

	public static void main(String[] args) {
		
		Table4 obj = new Table4();
		Table4 obj2 = new Table4();
		Thread9 t9 = new Thread9(obj);
		t9.start();
		
		Thread10 t10 = new Thread10(obj2);
		t10.start();

	}

}
