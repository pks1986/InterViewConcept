
public class Reverseof3digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		
		int n1 = num/100;
		int n2 = num%100;
		int n3 = n2/10;
		int n4 = n2%10;
		
		int rev = n4*100 + n3*10 + n1;
		System.out.println("Reverse of " + num + " is " + rev);

	}

}
