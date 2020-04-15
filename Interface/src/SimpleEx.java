interface my{
	void print();
	int NUM =10;
}

interface my2 extends my{
	void other();
}

class B implements my{
	void display(){
		System.out.println("Display of B class");
	}
	public void print(){
		System.out.println("Print function Implemented");
	}
}

class A extends B implements my, my2{
	public void other(){
		System.out.println("Method of A class class");
	}
}
public class SimpleEx {
	public static void main(String[] args) {
		A obj = new A();
		obj.print();
		obj.other();

	}

}
