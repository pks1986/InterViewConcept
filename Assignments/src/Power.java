
public class Power {

	/**
	 * Calculate the power without using pow()
	 */
	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		int pow = 1;
		for(int i = 0; i < n; i++){
			pow = pow*x;
		}
		System.out.println(x + " raise to the power of " + n + " is " + pow);

	}

}
