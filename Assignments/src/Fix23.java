
public class Fix23 {

	/**
	 * @RAKESH YADAV
	 * 18th February 2015
	 * Given an array of length 3, if there is a 2 in the array immediately followed by a 3,
	 * set the 3 element to 0.
	 */
	public static void main(String[] args) {
		int []arr = {1, 2, 3, 4, 2, 3, 5};
	//	int []arr3 = {1, 3, 2};
		
		int []arr2 = new int[arr.length];
		arr2 = fixit(arr);
		for(int i = 0; i < arr2.length; i ++){
			System.out.print(arr2[i] + "\t");
		}
	}
	static int []fixit(int []arr){
		int []arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i ++){
			arr2[i] = arr[i];
			if(arr[i] == 2){
				if(arr[i+1] == 3){
					arr2[i+1] = 0;
					i++;
				}
			}
		}
		return arr2;
	}

}
