class LocalClass{
	private int num = 6;
	void display(){
		
		int num2 = 10;
		
		//int num2 = 10;	
		//valid in jdk 8 and above if it's value never changed after this.
		
		
		System.out.println("Display of outer class\n");
		class Innermost{
			void display2(){
				System.out.println("Display2 method invoked");
				System.out.println("\n" + (num + num2));
			}
		}
		Innermost in = new Innermost();
		in.display2();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalClass lc = new LocalClass();
		lc.display();
		
	}

}
