
public class MakeMiddle {

	/**
	 * @RAKESH YADAV
	 * 18th February 2015
	 * Given an array of ints of even length, return a new array of length 2
	 * containing the middle two elements from the original array.
	 */
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 5, 6, 7};
		int []arr2 = new int[2];
		arr2 = middle(arr);
		System.out.println("Array: ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}	   
		System.out.println("\n\nMiddle Elements: ");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + "\t");
		}
	}
	
	static int []middle(int []arr){
		int []arr2 = new int[2];
		arr2[0] = arr[arr.length/2-1];
		arr2[1] = arr[arr.length/2];
		return arr2;
	}

}
