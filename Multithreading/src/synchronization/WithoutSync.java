package synchronization;
class Table{
	public void printTable(int n){
		for(int i = 1; i <= 10; i++){
			System.out.println(n*i);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thread1 extends Thread{
	Table t;
	Thread1(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}

class Thread2 extends Thread{
	Table t;
	Thread2(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(8);
	}
}

public class WithoutSync {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t = new Table();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		t1.start();
		t2.start();
	}

}
