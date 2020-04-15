
public class RotateLeft {

	/**
	 * @Rakesh Yadav
	 * 17th February 2015
	 * Return an array whose elements are rotated left and last element is the first element
	 */
	public static void main(String[] args) {		
		int[] arr = {1, 2, 3, 4};
		int[] arr2 = rotated(arr);
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\nRotated Array:");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	
	static int[] rotated(int[] arr){
		int arr2[] = new int[arr.length];
		arr2[arr.length-1] = arr[0];
		for(int i = 1; i < arr.length; i++){
			arr2[i-1] = arr[i];
		}
		
		return arr2;
	}

}
