package java8.methodreference;

interface ConstructorReference {
	ReferConstructor getConstructor(String message);
}

public class ReferConstructor {
	
	public ReferConstructor(String message) {
		System.out.println(message);
	}
	
	public static ReferConstructor getReferConstructorInstance(String message) {
		return new ReferConstructor(message);
	}

	public static void main(String[] args) {
		//Without new, using a method
		ConstructorReference consRef = ReferConstructor::getReferConstructorInstance;
		consRef.getConstructor("hello");
		
		//With new 
		ConstructorReference consRef2 = ReferConstructor::new;
		consRef2.getConstructor("Hello Again");
		
	}
}
