package java8.methodreference;

interface InstanceMethodInterface {
	void saySomething();
}

public class ReferringInstanceMethod {
	
	public void somethingImplementation() {
		System.out.println("Hello I am saying something");
	}
	
	public static void main(String args[]) {
		
		ReferringInstanceMethod thisClassInstance = new ReferringInstanceMethod();
		InstanceMethodInterface interfaceObj = thisClassInstance::somethingImplementation;
		interfaceObj.saySomething();
		
		InstanceMethodInterface myObj = new ReferringInstanceMethod()::somethingImplementation;
		myObj.saySomething();
	}

}
