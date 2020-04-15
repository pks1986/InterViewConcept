import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

	/**
	 * Program to find position of a value from a sorted array
	 * Incomplete Program
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length of the Array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Input Array Separated by space or enter: ");
		for(int i = 0; i <arr.length; i ++){							//Entering Array
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println("Plz input the search value: ");
		int val = sc.nextInt();
		
		int pos = binarySearch(arr, val);
		
		if(pos=='\0'){
			System.out.println(val + " is not found in the given array");
		}
		else
			System.out.println(val + " is found at position " + (pos+1));
	}
	
	static int binarySearch(int[] arr, int val){
		int pos = 0;
		int flag = 0;
		if(val < arr[arr.length]/2){
			for(int i = 0; i < arr.length; i++){
				if(val < arr[i]/2){
		}
			}
		}
		
		if(flag == 1){			//If array found
			return pos;
		}
		
		else 					//If array not found
			return '\0' ;
		
	}

}
