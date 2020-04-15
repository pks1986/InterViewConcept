package synchronization;
class Table3{
	void printTable(int n){
		synchronized(this){
			for(int i = 1; i <= 10; i++){
				System.out.print(n*i + "\t");
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\t");
		}
	}
}

class Thread7 extends Thread{
	Table3 t;
	Thread7(Table3 t){
		this.t = t;
	}
	public void run(){
		t.printTable(50);		
	}
}

class Thread8 extends Thread{
	Table3 t;
	Thread8(Table3 t){
		this.t = t;
	}
	public void run(){
		t.printTable(100);		
	}
}

public class SyncBlock2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table3 obj = new Table3();
		Thread7 t7 = new Thread7(obj);
		Thread8 t8 = new Thread8(obj);
		t7.start();
		t8.start();

	}

}
