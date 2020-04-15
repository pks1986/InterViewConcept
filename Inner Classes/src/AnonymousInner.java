// VVimp, instantiating abstract class using anonymous classes.
abstract class Person{
	abstract void eat();
}
public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(){
			void eat(){
				System.out.println("Nice Fruits");
			}
		};
		p.eat();
	}
}
