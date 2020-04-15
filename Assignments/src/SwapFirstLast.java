public class SwapFirstLast {

	/**
	 * @RAKESH YADAV
	 * 18th February 2015
	 * Swap the first and last elements of an array.
	 */
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 5, 4};
		int []arr2 = new int[arr.length];
		
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		arr2 = swap(arr);
		System.out.println("\n\nAfter Swapping: ");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	static int []swap(int []arr){
		int []arr2 = new int[arr.length];
		for(int i = 1; i < arr.length-1; i++){
			arr2[i] = arr[i];
		}
		arr2[0] = arr[arr.length-1];
		arr2[arr2.length-1] = arr[0];
		return arr2;
	}

}
