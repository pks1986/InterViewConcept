//We are invoking the method of member inner class from the display method of Outer class

class Outer{
	private int data = 30;
	class Inner{
		void msg(){
			System.out.println("Data is " + data);
		}
	}
	void display(){
		Inner in = new Inner();
		in.msg();
	}
}

public class MemberInnerClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer out = new Outer();
		out.display();
		//Inner in2 = new Inner();		//Error, can't access inner directly
		Outer.Inner in3 = out. new Inner();
		//Outer.Inner in3 = new Outer(). new Inner();		//will work
		in3.msg();
	}

}
