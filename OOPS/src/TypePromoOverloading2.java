
public class TypePromoOverloading2 {
	
	//Ambiguity
	
	void print(int a, long b){
		System.out.println(a+b);
	}
	void print(long a, int b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TypePromoOverloading2 ob = new TypePromoOverloading2();
	//	ob.print(34, 5);
		TypePromoOverloading2 ob2 = new TypePromoOverloading2();
	//	ob2.print(23, 5);
	}
}
