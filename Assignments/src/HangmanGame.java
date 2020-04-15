public class HangmanGame {
	/**
	 * Write a program to play a word-guessing game like Hangman.
	   It must randomly choose a word from a list of words.
	   It must stop when all the letters are guessed.
	   It must give them limited tries and stop after they run out.
	   It must display letters they have already guessed (either only the incorrect guesses or all guesses).
	   leviathan
	 *//*
	static char guess;
	static String searchStr = "leviathan";
	static char []search = searchStr.toCharArray();
	static char []word = new char[search.length];
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("You have to complete a word of " + search.length + " chars");
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.print("\nWord: ");
		for(int i = 0; i < word.length; i ++){
			word[i] = '_';
			System.out.print(word[i]+ " ");
		}
		char guessed = guess();
		check(word, guessed);
	}
	static void check(char []word, char guessed) throws IOException{
		String word2 = new String(word);
		if(word2.equals("leviathan")){
			System.out.println("Word: " + word2);
			miss();
			System.out.println("YOU GOT IT");
		}
		else{
			words(guessed);
			miss();
			guess();
		}
	}

	static char []words(char guessed){
		for(int i = 0; i < search.length; i ++){ //search is char array leviathan
			{
				int count = 0;
				if(guessed == search[i]){
					if(word[i] == '_'){
						word[i] = guessed;
						count++;
						break;
					}
				}
			}
		}
		return word;
	}
	static char guess() throws IOException{
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nGuess:");
		ch = (char)br.read();
		return ch;
	}
	static String miss(int count, ){
		if(count == 1){
			String guess = new String(guessed);
			missed = missed.concat(guess);
			return missed;
		}
	}*/
}
