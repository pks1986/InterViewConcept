
class Class1{
	
}

class Class2 extends Class1{
	
}
class Class3 {
	
}
public class InstanceOf {

	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2;
		c2 = null;
		//Class3 c3 = new Class3();
		System.out.println(c1 instanceof Class1 );
		System.out.println(c2 instanceof Class2 );
		System.out.println(c2 instanceof Class1 );
		//System.out.println(c2 instanceof Class3 );
	}

}
