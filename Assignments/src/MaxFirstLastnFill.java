import java.util.Arrays;


public class MaxFirstLastnFill {

	/**
	 * @RAKESH YADAV
	 * 17th February 2015
	 * Find maximum of first and last elements and fill the complete array with that value 
	 */
	public static void main(String[] args) {
		int []arr = {1, 4, 2, 7, 5};
		int [] arr2 = new int[arr.length];
		arr2 = maxFill(arr);
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n\nEdited Array:");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	static int []maxFill(int[] arr){
		int []arr2 = new int[arr.length];
		if(arr[0] >= arr[arr.length-1]){
			Arrays.fill(arr2, arr[0]);
		}
		else
			Arrays.fill(arr2, arr[arr.length-1]);
			
		return arr2;
	}

}
