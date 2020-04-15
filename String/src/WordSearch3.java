public class WordSearch3 {	
	
	static char[][] myChars = { {'i','a','d','c','a'},
								{'n','i','a','h','j'},
								{'d','d','i','i','n'},
								{'i','n','d','i','a'},
								{'a','i','n','a','a'},
								{'c','h','i','n','a',}};
	static String []words = {"india", "china"};
	static int row;
	static int col;
	public static void main(String []args){
		for(int i = 0; i < words.length; i ++){
			char []word = words[i].toCharArray();
			findFirstWord(word);
		}
	}
	static void findFirstWord(char []word){
		for(int i = 0; i < myChars.length; i ++){
			for(int j = 0; j < myChars[i].length; j ++){
				if(word[0] == myChars[i][j]){
					row = i;
					col = j;
					checkEachDirection(word);
				}
			}
		}
	}
	static void checkEachDirection(char []word){
		findForwards(word);
	}
	static void findForwards(char []word){
		for(int i = 0; i < myChars.length; i ++){
			for(int k = 0; k < myChars[i].length; k ++){
				
			}
		}
	}
}
















