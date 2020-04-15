
public class NumberPyramid {

	/**
	 *   0
	 *  1 2
	 * 3 4 5
	 *6 7 8 9
	 *  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 32;
		int num = 0;
		for(int i = 0; i < 4; i ++){
			for(int k = 3; k > i; k--){
				System.out.print(ch);
			}
			for(int j = 0; j <= i; j++){
				System.out.print(num);
				System.out.print(ch);
				num++;
			}
			System.out.println();
		}
		

	}

}
