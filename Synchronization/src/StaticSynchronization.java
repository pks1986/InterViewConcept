
public class StaticSynchronization {

	public static void main(String[] args) {
		Table5 table1 = new Table5();
		Table5 table2 = new Table5();
		Thread t1 = new MyThread1(table1);
		Thread t2 = new MyThread1(table1);
		
		Thread t3 = new MyThread2(table2);
		Thread t4 = new MyThread2(table2);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Table5 {

	synchronized static void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}
}

class MyThread1 extends Thread {
	
	Table5 table;
	
	public MyThread1(Table5 table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(1);
	}
}

class MyThread2 extends Thread {
Table5 table;
	
	public MyThread2(Table5 table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(100);
	}
}