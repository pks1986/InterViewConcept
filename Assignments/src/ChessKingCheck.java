
public class ChessKingCheck {

	/**
	 * @RAKESH YADAV
	 * 27TH FEBRUARY 2015
	 * Check whether a king is in safe position or not. If he is not, find possible moves.
	 * Matrix is not necessary to be of 8*8. It can be of any size.
	 * King, Queen, Bishop(Wazir), Rook(Elephant), Knight(Horse), Pawn(Pyade).
	 * 
	 * We will have to check "Check Condition" from Left, Right, Up, Down, all 4 diagonal directions and from the Knight
	 */
	static char [][]board = {{'K','_','_','k','_','_','_','_'},
							 {'_','_','_','_','_','_','_','_'},
							 {'q','n','_','_','_','_','_','q'},
							 {'_','_','_','_','_','_','_','_'},
							 {'_','_','_','_','_','_','_','_'},
							 {'_','_','_','_','_','_','_','_'}		
	};
	static int row;
	static int col;
	
	public static void main(String[] args) {
		printMatrix();
		boolean safe = isKingSafe(board);
		if(safe == true){
			System.out.println("\nKing is safe");
		}
		else{
		//	System.out.println("\nKing is not safe");
		}
	}
	//Finding position of the King and Printing Matrix
	static void printMatrix(){
		for(int i = 0; i < board.length; i ++){
			for(int j = 0; j< board[i].length; j ++){
				System.out.print(board[i][j] + " ");
				if(board[i][j] == 'K'){
					row = i;
					col = j;
				}
			}
			System.out.println();
		}
		System.out.println("\nKing is at Position board(" +row + ", "+ col + ")");
	}
	
	static boolean isKingSafe(char [][]board){
		System.out.println("\n" + checkKnight());
		return false;
	}
	//Checking from Left Direction
	static boolean checkLeft(){
		int c = 0;
		int check = 0;
		for(int i = col-1; i >= 0; i --){
			//Checking if there is rook or queen of opponent in the left of King
			if(board[row][i] == 'q' || board[row][i] == 'r'){
				c = i;
				check = 1;
				break;
			}
		}
		//if there is no rook or queen of opponent in the left of King
		if(check == 0)		
			return true;
		//if there is rook or queen in left
		if(check == 1){		
			for(int i = c+1; i < col; i++){
				//check if there is anything else between our King and queen or rook
				if(board[row][i] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from Right Direction
	static boolean checkRight(){
		int c = 0;
		int check = 0;
		for(int i = col+1; i < board[0].length; i ++){
			//Checking if there is rook or queen of opponent in the right of King
			if(board[row][i] == 'q' || board[row][i] == 'r'){
				c = i;
				check = 1;
				break;
			}
		}
		//if there is no rook or queen of opponent in the left of King
		if(check == 0)		
			return true;
		//if there is rook or queen in left
		if(check == 1){		
			for(int i = c-1; i > col; i--){
				//check if there is anything else between our King and queen or rook
				if(board[row][i] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from Upward Direction
	static boolean checkUp(){
		int r = 0;
		int check = 0;
		for(int i = row-1; i >= 0; i --){
			//Checking if there is rook or queen of opponent in upward direction of King
			if(board[i][col] == 'q' || board[i][col] == 'r'){
				r = i;
				check = 1;
				break;
			}
		}
		//if there is no rook or queen of opponent in upward direction of King
		if(check == 0)		
			return true;
		//if there is rook or queen in left
		if(check == 1){		
			for(int i = row-1; i > r; i--){
				//check if there is anything else between our King and queen or rook
				if(board[i][col] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from Downward Direction
	static boolean checkDown(){
		int r = 0;
		int check = 0;
		for(int i = row+1; i < board.length; i ++){
			//Checking if there is rook or queen of opponent in downward direction of King
			if(board[i][col] == 'q' || board[i][col] == 'r'){
				r = i;
				check = 1;
				break;
			}
		}
		//if there is no rook or queen of opponent in downward direction of King
		if(check == 0)		
			return true;
		//if there is rook or queen in left
		if(check == 1){		
			for(int i = row+1; i < r; i++){
				//check if there is anything else between our King and queen or rook
				if(board[i][col] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from diagonal Left Up Direction
	static boolean checkDiagonalLeftUp(){
		int r = 0;
		int c = col;
		int check = 0;
		
		//Checking for pawn of the opponent in the diagonal left up direction
		if(row > 0 && col > 0){
			if(board[row-1][col-1] == 'p'){
				return false;
			}
		}
		
		for(int i = row-1; i >= 0; i --){
			//Checking if there is bishop or queen of opponent in diagonal left up direction of King
			c--;
			if(c < 0)						//Checking for column bound
				break;
			if(board[i][c] == 'q' || board[i][c] == 'b'){
				r = i;
				check = 1;
				break;
			}
		}
		//if there is no bishop or queen of opponent in diagonal left up direction of King
		if(check == 0)		
			return true;

		if(check == 1){		
			c = col;
			for(int i = row-1; i > r; i--){
				//check if there is anything else between our King and queen or bishop of opponenet
				c--;
				if(board[i][c] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from diagonal Right Up Direction
	static boolean checkDiagonalRightUp(){
		int r = 0;
		int c = col;
		int check = 0;
		
		//Checking for pawn of the opponent 
		if(row > 0 && col < board[0].length){
			if(board[row-1][col+1] == 'p'){
				return false;
			}
		}
		
		for(int i = row-1; i >= 0; i --){
			//Checking if there is bishop or queen of opponent
			c++;
			if(c == board[0].length)						//Checking for column bound
				break;
			if(board[i][c] == 'q' || board[i][c] == 'b'){
				r = i;
				check = 1;
				break;
			}
		}
		//if there is no bishop or queen of opponent in diagonal left up direction of King
		if(check == 0)		
			return true;

		if(check == 1){		
			c = col;
			for(int i = row-1; i > r; i--){
				//check if there is anything else between our King and queen or bishop of opponenet
				c++;
				if(board[i][c] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from diagonal Left Down Direction
	static boolean checkDiagonalLeftDown(){
		int r = row;
		int c = 0;
		int check = 0;
		for(int i = col-1; i >= 0; i --){
			//Checking if there is bishop or queen of opponent
			r++;
			if(r == board.length){						//Checking for row bound
				break;
			}
			if(board[r][i] == 'q' || board[r][i] == 'b'){
				c = i;
				check = 1;
				break;
			}
		}
		//if there is no bishop or queen of opponent in diagonal left up direction of King
		if(check == 0)		
			return true;

		if(check == 1){		
			r = row;
			for(int i = col-1; i > c; i--){
				//check if there is anything else between our King and queen or bishop of opponenet
				r++;
				if(board[r][i] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
	//Checking from diagonal Right Down Direction
	static boolean checkDiagonalRightDown(){
		int r = row;
		int c = 0;
		int check = 0;
		for(int i = col+1; i < board[0].length; i ++){
			//Checking if there is bishop or queen of opponent
			r++;
			if(r == board.length){						//Checking for row bound
				break;
			}
			if(board[r][i] == 'q' || board[r][i] == 'b'){
				c = i;
				check = 1;
				break;
			}
		}
		//if there is no bishop or queen of opponent in diagonal left up direction of King
		if(check == 0)		
			return true;

		if(check == 1){		
			r = row;
			for(int i = col+1; i < c; i ++){
				//check if there is anything else between our King and queen or bishop of opponenet
				r++;
				if(board[r][i] != '_'){		
					check++;
					break;
				}
			}
		}
		if(check == 2)
			return true;
		else
			return false;
	}
	
//Checking for Knight
	static boolean checkKnight(){
		int flag = 0;
		int r = 0;
		int c = 0;
		outer:
		for(int i = 0; i < board.length; i ++){
			for(int j = 0; j < board[i].length; j ++){
				if(board[i][j] == 'n'){
					r = i;
					c = j;
					break outer;
				}
			}
		}
		System.out.println("Knight is at position (" + r + "," + c + ")");
		if(((row-2) >= 0) && ((col-1) >= 0)){
			if(board[row-2][col-1] == 'n')
				flag = 1;
		}
		else if(((row-2) >= 0) && ((col+1) >= 0)){
			if(board[row-2][col+1] == 'n')
				flag = 1;
		}
		else if(((row-1) >= 0) && ((col+2) >= 0)){
			if(board[row-1][col+2] == 'n')
				flag = 1;
		}
		else if(((row+1) >= 0) && ((col+2) >= 0)){
			if(board[row+1][col+2] == 'n')
				flag = 1;
		}
		else if(((row+2) >= 0) && ((col+1) >= 0)){
			if(board[row+2][col+1] == 'n')
				flag = 1;
		}
		else if(((row+2) >= 0) && ((col-1) >= 0)){
			if(board[row+2][col-1] == 'n')
				flag = 1;
		}
		else if(((row+1) >= 0) && ((col-2) >= 0)){
			if(board[row+1][col-2] == 'n')
				flag = 1;
		}
		else if(((row-1) >= 0) && ((col-2) >= 0)){
			if(board[row-1][col-2] == 'n')
				flag = 1;
		}
		if(flag == 1)
			return false;
		else 
			return true;
	}
}














































