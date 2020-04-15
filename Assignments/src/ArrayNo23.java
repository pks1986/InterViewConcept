
public class ArrayNo23 {

	/**
	 * @RAKESH YADAV
	 * 18th February 2015
	 * Given an array check whether it contains 2 or 3
	 */
	public static void main(String[] args) {
		int []arr = {5, 6, 7, 2};
		System.out.println("Array contain 2 or 3: " + no23(arr));
	}
	
	static boolean no23(int []arr){
		int flag = 0;
		for(int i = 0; i < arr.length; i ++){
			if(arr[i] == 2 || arr[i] ==3){
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			return true;
		else 
			return false;
	}

}
