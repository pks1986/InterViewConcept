
public class SameFirstLastElement {

	/**
	 * @Rakesh Yadav
	 * 17th February 2015
	 * Return true if either first elements or last elements of the array are same.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {2, 4};
		System.out.println(sameElement(arr1, arr2));

	}
	static boolean sameElement(int[] arr1, int[] arr2){
//		boolean check = false;
//		if(arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]){
//			check = true;
//		}
//		return check;
		
		return (arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]);
	}

}
