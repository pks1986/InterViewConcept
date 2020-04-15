package synchronization;
class Table1{
	 public synchronized void printTable1(int n){
		for(int i = 1; i <= 10; i++){
			System.out.print(n*i);	
			System.out.print("\t");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}
class Thread3 extends Thread{
	Table1 t;
	Thread3(Table1 t){
		this.t = t;
	}
	public void run(){
		t.printTable1(5);
	}
}

class Thread4 extends Thread{
	Table1 t;
	Thread4(Table1 t){
		this.t = t;
	}
	public void run(){
		t.printTable1(8);
	}
}

public class WithSyncMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 t = new Table1();
		Thread3 t1 = new Thread3(t);
		Thread4 t2 = new Thread4(t);
		t1.start();
		t2.start();
	}

}
