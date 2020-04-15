package threading;

public class GarbageCollection {
	public void finalize(){
		System.out.println("Garbage Collection Completed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		GarbageCollection ob1 = new GarbageCollection();
		GarbageCollection ob2 = new GarbageCollection();
		ob1 = null;
		//ob2 = null;
		System.gc();
	}

}
