
public class VarArgs {
	
	//static void display( int num...,  int... a){ //error, only 1 vararg per function is allowed
	//static void display(int... a, int a){        //error, vararg must me last arg.
	static void display(int... a){
		//System.out.println(a[3]);
		for(int i: a){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display(1, 2, 3, 4, 5);

	}

}
