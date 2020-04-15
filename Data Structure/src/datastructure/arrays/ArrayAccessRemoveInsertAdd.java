package datastructure.arrays;

class ArrayOperations {
	int arr[];
	int MAX = 10;
	int totalElementsCurrentlyInArray;

	public ArrayOperations() {
		arr = new int[MAX];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		totalElementsCurrentlyInArray = 5;
	}

	void displayItems() {
		for (int i = 0; i < totalElementsCurrentlyInArray; i++) {
			System.out.print("\t" + arr[i]);
		}
	}

	void accessItem(int position) {
		System.out.println("\nItem at position " + position + " is " + arr[position]);
	}

	void insertItem(int pos, int value) {
		int j = totalElementsCurrentlyInArray;
		totalElementsCurrentlyInArray = totalElementsCurrentlyInArray + 1;
		while (j >= pos) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[pos] = value;
		displayItems();
	}
	
	void removeItem(int pos) {
		if(pos < totalElementsCurrentlyInArray) {
			int k = pos;
			while (k < totalElementsCurrentlyInArray) {
				arr[k] = arr[k + 1];
				k ++;
			}
			totalElementsCurrentlyInArray = totalElementsCurrentlyInArray - 1;
			displayItems();
		} else {
			System.out.println("\nNo element exists at position " + pos);
		}		
	}
}

public class ArrayAccessRemoveInsertAdd {

	public static void main(String[] args) {
		ArrayOperations arrOpns = new ArrayOperations();
		System.out.println("\nElements of array: \n");
		arrOpns.displayItems();
		/*arrOpns.accessItem(3);
		arrOpns.removeItemAtPosition(3);*/

		System.out.println("\n\nAfter inserting element 10 at position 2 Elements of array: \n");
		arrOpns.insertItem(2, 10);
		

		System.out.println("\n\nAfter removing element at position 1 Elements of array: \n");
		arrOpns.removeItem(5);
		
		
	}

}
