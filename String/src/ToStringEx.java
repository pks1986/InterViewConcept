
public class ToStringEx {
	int n;
	String name;
	ToStringEx(int n, String name){
		this.n = n;
		this.name= name;
	}
	
	public String toString(){
		return n + " " +name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringEx ob1 = new ToStringEx(103, "Rahul");
		ToStringEx ob2 = new ToStringEx(104, "Sumit");
		System.out.println(ob1);
		System.out.println(ob2);

	}

}
