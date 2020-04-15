import java.util.Scanner;


public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program for linear search
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length of the Array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		System.out.println("Input Array Separated by space or enter: ");
		for(int i = 0; i <arr.length; i ++){							//Entering Array
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Plz input the search value: ");
		int val = sc.nextInt();
		int pos = linSearch(arr, val);
		
		if(pos=='\0'){
			System.out.println(val + " is not found in the given array");
		}
		else
			System.out.println(val + " is found at position " + (pos+1));

	}
	static int linSearch(int[] arr, int val){
		int pos = 0;
		int flag = 0;
		for(int i = 0; i < arr.length; i ++){			//searching val in array
			if(arr[i] == val){
				pos = i;
				flag = 1;
				break;
			}
		}
		
		if(flag == 1){			//If array found
			return pos;
		}
		
		else 					//If array not found
			return '\0' ;
	}

}
