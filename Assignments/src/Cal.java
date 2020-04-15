
public class Cal {

	static int i = 10;
	
	public static void main(String[] args) {
		Cal fm = new Cal();
		System.out.println(fm.cal(fm.cal(fm.cal(23, -32), 23), 8));
		System.out.println(i);
		
	}
	
	int cal(int a, int b) {
		return (a>b?a:b);
	}
}
