package java8.functionalinterfaces;

interface FunInterface2 {
	void say();
}

//Cannot use this annotation because @FunInterface3 is not a functional interface
//because it contains 2 abstract methods
//So a compile time error
//@FunctionalInterface
interface FunInterface3 extends FunInterface1 {
	void sayAnything();
}

public class ReferOtherFunInterface {

}
