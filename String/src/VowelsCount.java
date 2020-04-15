
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello Dude Umd";
		char ch[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E','I' ,'O', 'U'};
		char ch2[] = str.toCharArray();
		
		int count = 0;
		
		int space = 0;
		for(int i = 0; i <ch2.length; i ++){
			if(ch2[i]==32){
				space++;
			}
			for(int j = 0; j <ch.length; j++){
				if(ch[j] == ch2[i]){
					count++;
				}
			}
		}
		System.out.println("Length of String: " + str.length());
		System.out.println("Vowels: " +count);
		System.out.println("Consonants: " + (str.length()-(count+space)));
		System.out.println("Space are " + space);

	}

}
