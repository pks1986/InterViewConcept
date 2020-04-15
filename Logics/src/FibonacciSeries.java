
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1;
		int n2 =1;
		int n3;
//		int temp = 1;
//		System.out.print(n1 + "  ");
//		System.out.print(n2 + "  ");
//		for(int i = 1; i <15-2; i++){
//			n2 = temp+n2;
//			System.out.print(n2 + "  ");
//			temp = n1;
//			n1 = n2;
//			
//		}
		
		System.out.print(n1 + "  ");
		System.out.print(n2 + "  ");
		for(int i = 1; i <15-2; i++){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3 + "  ");
		}

	}

}
