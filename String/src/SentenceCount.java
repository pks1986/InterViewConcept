
public class SentenceCount {

	/**
	 * Trying to count the number of sentences
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("First Sentence. Second sentence.");
		String str2 = new String("First Sentence. Second sentence. Third Sentence");
		System.out.println("Length of str is " + countSentence(str) + ".");
		System.out.println("Length of str2 is " + countSentence(str2) + ".");
				
	}
	static int countSentence(String str){
		char []ch = str.toCharArray();
		int count = 0;		
		for(int i = 0; i < ch.length; i++){
			if(ch[i] == '.'){
				count++;
			}
		}
		if(ch[ch.length-1] != '.')
			count++;
		return count;
	}
}
