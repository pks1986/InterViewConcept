
public class CharDatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 90;
		char ch=88;
		char ch2 = 'Y';
		char ch3 = (char)num;      //If we won't type convert it will show error
		System.out.println(ch + " " +ch2 + " " + ch3);
		ch = 65;
		for(int i = 0; i < 26; i++){
			System.out.println(ch++);
		}
	}

}
