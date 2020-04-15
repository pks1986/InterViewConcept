package synchronization;
class MyClass{
	synchronized void m(){
		System.out.println("M Method " + this);
		n();
	}
	synchronized void n(){
		System.out.println("N Method " + this);
	}
}
class Thread18 extends Thread{
	MyClass obj;
	Thread18(MyClass obj){
		this.obj = obj;
	}
	public void run(){
		obj.m();
	}
}
public class ReentrantEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass obj = new MyClass();
		Thread t18 = new Thread18(obj);
		t18.start();

	}

}
