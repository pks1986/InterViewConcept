
public class StaticTest {
	int num;
	static{
		System.out.println("Static block executed");
		System.out.println(new StaticTest().num);
		//System.exit(0);
	}
	public static void main(String[] args) {
		System.out.println("Main block executed");
	}

}