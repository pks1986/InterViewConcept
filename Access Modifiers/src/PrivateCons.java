class A{
	private int a;
	private A(){
	}
	A(int a){
		this.a = a;
	}
}
public class PrivateCons {

	public static void main(String[] args) {
		A obj = new A(50);
		//System.out.println(obj.a);
		
	}

}
