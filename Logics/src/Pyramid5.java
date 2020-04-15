
public class Pyramid5 {

	/**
	 *  	   *
	 *	      * *
	 *       * * *
	 *      * * * *
	 *     * * * * *
	 *     and reverse of it
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char space = ' ';
		
		for(int i = 1; i <= 5; i++){
			for(int l=5-i; l>=1; l--){
				System.out.print(space);
			}
			for(int j = 1; j <= i; j++){
				System.out.print("*");
				System.out.print(space);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i = 1; i <= 5; i++){
			for(int l = 1; l<i; l++){
				System.out.print(space);
			}
			for(int j = 5; j >= i; j--){
				System.out.print("*");
				System.out.print(space);
			}
			System.out.println();
		}
	}

}
