package java8.methodreference;

public class ReferenceToStaticMethod {
		
	public static void saySomething() {
		System.out.println("This method is referring to method of functional interface sayable");
	}
	public static void main(String[] args) {
		Sayable sayable = ReferenceToStaticMethod::saySomething;
		sayable.say();
	}
}

interface Sayable {
	void say();
}
