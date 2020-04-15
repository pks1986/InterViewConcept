package java8.functionalinterfaces;

interface FunInterface4 {
	static void staticDoItNow() {
		System.out.println("Static Do it now");
	}
	
	default void defaultDoItNow() {
		System.out.println("Default do it now");
	}
}
@FunctionalInterface
interface FunInterface5 extends FunInterface4{
	void mainMethod();
}


public class ExtendingOtherNonFunctionalInterface {

	public static void mainMethodImplementation() {
		System.out.println("Main method implementation");
	}
	
	public static void main(String[] args) {
		FunInterface5 fun = ExtendingOtherNonFunctionalInterface::mainMethodImplementation;
		fun.mainMethod();
		fun.defaultDoItNow();
		//fun.staticDoItNot();  Compile Time Error, not a method of FuncInterface5;
		FunInterface4.staticDoItNow();
	}
}
