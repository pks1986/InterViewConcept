
public class MultipleInheritanceJava8 implements First, Second{

	public static void main(String[] args) {
		MultipleInheritanceJava8 mult = new MultipleInheritanceJava8();
		mult.method1();
		//mult.method2();
		Second.method2();
	}

	@Override
	public void method1() {
		Second.super.method1();
	}

}

interface First {
	default void method1(){
		System.out.println("Method1 of First Interface");
	}
}

interface Second {
	default void method1(){
		System.out.println("Method1 of Second Interface");
	}
	
	static void method2(){
		System.out.println("Static method2 of Second Interface");
	}
}