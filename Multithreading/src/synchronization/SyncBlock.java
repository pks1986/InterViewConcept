package synchronization;
class Table2{
	void printTable(int n){
		synchronized(this){
			for(int i = 1; i <= 10; i++){
				System.out.print(i*n + "\t");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("\n");
		}
	}
}
public class SyncBlock {
	//Also using Anonymous classes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Table2 obj = new Table2();
		Thread t5 = new Thread(){
			public void run(){
				obj.printTable(10);
			}
		};
		
		Thread t6 = new Thread(){
			public void run(){
				//Table2 obj = new Table2(); If we will use this line sync will not occur
				obj.printTable(20);
			}
		};
		
		t5.start();
		t6.start();

	}

}
