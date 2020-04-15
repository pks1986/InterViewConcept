

class AA {

	int num;

	// AA(){
	// System.out.println("A Class default constructor");
	// }
	AA(int a) {
		num = a;
		System.out.println("Num " + num);
	}
	
	public static void print() {
		System.out.println("Print in Parent Class");
	}
	
	public void fun() {
		System.out.println("Having Fun");
	}
}

class BB extends AA {

	BB(int num2) {
		// Try commenting the below line
		super(50);
		System.out.println("Num2 " + num2);
	}
	
	//@Override
	public static void print(){
		System.out.println("Print in Sub Class");
	}
	
	@Override
	public void fun() {
		System.out.println("Not Having Fun");
	}
}

public class InheritanceStaticMethod {
	public static void main(String[] args) {
		AA a = new BB(10);
		BB bb = new BB(10);
		a.print();
		bb.print();
		AA.print();
		
		a.fun();
		bb.fun();
	}
}
