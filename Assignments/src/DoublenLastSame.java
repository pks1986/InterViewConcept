import java.util.Arrays;


public class DoublenLastSame {

	/**
	 * @RAKESH YADAV
	 * 18th February 2015
	 * Given an int array, return a new array with double the length where its last
	 * element is same as the original array, and all the other elements are 0. By 
	 * the new array contains all 0's.
	 */
	public static void main(String[] args) {
		int []arr = {1, 2};
		int []arr2 = new int[2*arr.length];
		
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i ++){
			System.out.print(arr[i] + "\t");
		}
		
		arr2 = makeLast(arr);
		
		System.out.println("\n\nNew Array:");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	static int []makeLast(int []arr){
		int arr2[] = new int[2*arr.length];
		Arrays.fill(arr2, 0);
		arr2[arr2.length-1] = arr[arr.length-1];
		return arr2;
	}

}
