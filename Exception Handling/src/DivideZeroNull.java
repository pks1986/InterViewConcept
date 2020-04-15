
class DivideExcep{
	int a = 5;
	void dividebyzero(){
		System.out.println(a/0);	
	}
}

class NullExcep{
	String name;
	
	void nullexcep(){
		System.out.println(name);
		System.out.println(name.length());
	}
	
}
public class DivideZeroNull {
	
	public static void main(String[] args) {
		DivideExcep obj = new DivideExcep();
		obj.dividebyzero();
		
		NullExcep obj2 = new NullExcep();
		obj2.nullexcep();

	}

}
