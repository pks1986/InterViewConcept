class A1{
	static void st(){
		System.out.println("Static method in Superclass");
	}
	final void fi(){
		System.out.println("Final Method in Superclass");
	}
}
class B1 extends A1{
	static void st(){
		System.out.println("Static method in Subclass");
	}
}
public class StaticFinalMethods {
	
	public static void main(String[] args) {
		A1 a = new A1();
		A1.st();
		a.fi();

		B1.st();
	}

}
