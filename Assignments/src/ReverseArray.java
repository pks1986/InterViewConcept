
public class ReverseArray {

	/**
	 * @RAKESH YADAV
	 * 17th February 2015
	 * Reverse the elements of an Array
	 */
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5, 6, 111, 343};
		int[] arr2 = new int[arr.length];
		arr2 = reversed(arr);
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n\nReversed Array:");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	static int[] reversed(int[] arr){
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i ++){
			arr2[arr.length-i-1] = arr[i];
		}
		
		return arr2;
	}

}
