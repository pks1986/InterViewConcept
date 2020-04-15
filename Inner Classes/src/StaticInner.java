class OuterClass{
	static class Inner{
		void display(){
			System.out.println("Display method of static class");
		}
	}
}
public class StaticInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	OuterClass out = new OuterClass();
		OuterClass.Inner in = new OuterClass.Inner();
		in.display();
	}
}
