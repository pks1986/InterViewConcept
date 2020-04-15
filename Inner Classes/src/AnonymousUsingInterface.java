interface myInterface{
	void display();
}
public class AnonymousUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myInterface my = new myInterface(){
		public void display(){
				System.out.println("Display method");
			}
		};
		my.display();
	}
}
