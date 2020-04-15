
public class ThisToCallConstr {
	int id; 
	String name;
	ThisToCallConstr(){
		System.out.println("This is default Constructor");
	}
	ThisToCallConstr(int id, String name){
		this();
		this.id = id;
		this.name = name;
	}
	void display(){
		System.out.println("ID: " + id + " Name: " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ThisToCallConstr ob = new ThisToCallConstr();
//		ob.display();
		ThisToCallConstr ob2 = new ThisToCallConstr(103, "Rakesh");
		ob2.display();
		

	}

}
