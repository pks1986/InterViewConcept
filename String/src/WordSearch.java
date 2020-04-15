public class WordSearch {	
	
	static char[][] myChars = { {'i','a','d','c','a'},
								{'n','i','a','h','j'},
								{'d','d','i','i','e'},
								{'i','n','d','n','a'},
								{'a','i','n','a','a'},
								{'c','h','i','n','a',}};
	
	static String[] words = {"india","china"};
	static int foundRow;
	static int foundColumn;
	static char[] word;

	public static void main(String[] args) {
		
		for(int i = 0; i < words.length; i++){
			word = words[i].toCharArray();
			findFirstLetter(word);
		}
	}
	
	static void findFirstLetter(char[] word)
    {
        for(int r = 0; r < myChars.length; r++)
        {
            for(int c = 0; c < myChars[0].length; c++)
            {
                if(word[0] == myChars[r][c])
                {
                    foundRow = r;
                    foundColumn = c;
                    checkEachDirection(word);
                }
            }
        }
    }
	
	static void checkEachDirection(char[] word)
    {
        checkForwards(word);
        checkBackwards(word);
        checkUp(word);
        checkDown(word);
        checkDiagonalDown(word);
        checkDiagonalDown1(word);
        checkDiagonalUp(word);
        checkDiagonalUp1(word);		
    }

	// Check from left to right.
    static void checkForwards(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn + i > myChars[0].length - 1) return;
            if(word[i] != myChars[foundRow][foundColumn + i]) return;
            else{            	
            	arr[i][0]=foundRow;
            	arr[i][1]=foundColumn+i;
            	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}
        }
    }
    
    // Check from RIght to left.
    static void checkBackwards(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn - i < 0) return;
            if(word[i] != myChars[foundRow][foundColumn - i]) return;
            else{
	            arr[i][0]=foundRow;
	        	arr[i][1]=foundColumn-i;
	        	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}
        }
    }
    
    // Check Downward direction.    
    static void checkDown(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundRow + i > myChars.length-1) return;
            if(word[i] != myChars[foundRow + i][foundColumn]) return;
            else{
	            arr[i][0]=foundRow+i;
	        	arr[i][1]=foundColumn;
	        	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}
        }
    }

    // Check Upward direction.    
    static void checkUp(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundRow - i < 0) return;
            if(word[i] != myChars[foundRow - i][foundColumn]) return;
            else{
	            arr[i][0]=foundRow-i;
	        	arr[i][1]=foundColumn;
	        	count = i;
            }
        }   
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}
        }
    }
    
    //Check Diagonal Down from left to right.
    static void checkDiagonalDown(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn + i > myChars[0].length - 1) return;
            if(foundRow + i > myChars.length - 1) return;
            if(word[i] != myChars[foundRow + i][foundColumn + i]) return;
            else{
	            arr[i][0]=foundRow+i;
	        	arr[i][1]=foundColumn+i;
	        	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}        	
        }
    }
    
    //Check Diagonal Down from right to left.
    static void checkDiagonalDown1(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn - i < 0) return;
            if(foundRow + i > myChars.length - 1) return;
            if(word[i] != myChars[foundRow + i][foundColumn - i]) return;
            else{
	            arr[i][0]=foundRow+i;
	        	arr[i][1]=foundColumn-i;
	        	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}	
        }
    }

    // Check diagonal Up side from right to left.    
    static void checkDiagonalUp(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn - i < 0) return;
            if(foundRow - i < 0) return;
            if(word[i] != myChars[foundRow - i][foundColumn - i]) return;
            else{
            	//System.out.println("found "+word[i]+" at ("+foundRow+","+(foundColumn-i)+")");
            
            arr[i][0]=foundRow-i;
        	arr[i][1]=foundColumn-i;
        	count = i;
            }
        }
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}	
        }
    }
    
    // Check diagonal Up side from left to right.  
    static void checkDiagonalUp1(char[] word)
    {
    	int count = 0;
    	int[][] arr = new int[word.length][2];
    	arr[0][0] = foundRow;
    	arr[0][1] = foundColumn;
        for(int i = 1; i < word.length; i++)
        {
            if(foundColumn + i > myChars[0].length - 1) return;
            if(foundRow - i < 0 ) return;
            if(word[i] != myChars[foundRow - i][foundColumn + i]) return;
            else{
	            arr[i][0]=foundRow-i;
	        	arr[i][1]=foundColumn+i;
	        	count = i;
            }
        }    
        if(count == (word.length-1)){
        	System.out.println("found "+new String(word));
        	for(int i = 0; i < word.length; i++){
        		System.out.println(word[i]+" at ("+arr[i][0]+","+arr[i][1]+")\n");
        	}   	
        }
    }
}