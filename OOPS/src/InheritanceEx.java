class A{
	
	int num;
//	A(){
//		System.out.println("A Class default constructor");
//	}
	A(int a){
		num=a;		
		System.out.println("Num " + num);
	}
	
	public void fun() {
		System.out.println("Fun A");
	}
}

class B extends A{
	
	B(int num2){
		super(50);
		System.out.println("Num2 " + num2);
	}
	
	public void fun() {
		System.out.println("Fun B");
	}
}
public class InheritanceEx {

	public static void main(String[] args) {
		new B(10);
	}
}
