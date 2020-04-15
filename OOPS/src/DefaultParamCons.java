class Parameterized{
	int id;
	String name;
	Parameterized(int id, String name){
		this.id = id;
		this.name = name;
	}
	void Parameterized(){
		System.out.println("Method with same name as class");
		
	}
	public void display(){
		System.out.println(id + " " + name);
	}
}

public class DefaultParamCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized ob = new Parameterized(103, "Rakesh");
		ob.Parameterized();
		//Parameterized ob1 = new Parameterized();		//error

	}

}
