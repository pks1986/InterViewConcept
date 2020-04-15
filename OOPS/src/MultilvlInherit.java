abstract class Ab{
	abstract void method1();
	void display(){
		System.out.println("AB Class");
	}
}
 
abstract class Ba extends Ab{
		abstract void method1();
 @Override void display(){
			super.display();
			System.out.println("BA Class");
		}
}
class ABAB extends Ba{
	void method1(){
		System.out.println("Abstract method defined");
	}
}
public class MultilvlInherit {	
	public static void main(String[] args) {
		Ab ob = new ABAB();
		ob.method1();
		ob.display();
	}

}
