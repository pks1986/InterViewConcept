
public class TypePromoOverloading {
	
	//If there are matching type arguments in the method, type promotion is not performed.
	
	void print(int a, double b){
		System.out.println("Integer  " +(a+b));
	}
	void print(int a, int b, int c){
		System.out.println("Double  " +(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromoOverloading ob = new TypePromoOverloading();
		ob.print(34, 5);
		TypePromoOverloading ob2 = new TypePromoOverloading();
		ob2.print(23, 5.5);
	}
}
