package java8.functionalinterfaces;

interface FunInterface1 { 
	void say();
}

public class SimpleFunctionalInterface implements FunInterface1{

	public void say() {
		System.out.print("This is say of functional interface");
	}
	
	public static void main(String[] args) {
		FunInterface1 fun = new SimpleFunctionalInterface();
		fun.say();
	}

}
