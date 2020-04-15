package practice.com.searchalgorithm;

public class BinarySearch {
	int i;
	
	private int binarySearch(int[] arr, int x) {
		int l=0;
		int r=arr.length-1;
		while(l<=r)
		{
			int m =l + (r-2)/2;
			if (arr[m]==x)
			return m;
			if(arr[m]<x)
				l=m+1;
			else
				l=m-1;
		
		}		
			return -1;
	}
	public static void main(String[] args) {
		
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40};
		int length= arr.length;
		int x = 5;
		int j;
		int result = ob.binarySearch(arr, x); 
		System.out.println("Main Method");
		if(result == -1)
		{
			System.out.println("Element DOes Not Exist");
		}
		else
		{
			System.out.println("Element Exist at index" + result);
			System.out.println("Value of i and j is");
		}
	}

	/*
	 * public static void main1(String[] args) {
	 * 
	 * BinarySearch ob = new BinarySearch(); int arr[] = { 2, 3, 4, 10, 40 }; int
	 * length= arr.length; int x = 10; int result = ob.binarySearch(arr, x);
	 * System.out.println("Main1 Method"); }
	 */
	

}
