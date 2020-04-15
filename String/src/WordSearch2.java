
public class WordSearch2 {
	
	static String[] words = {"india", "china"};
	static char[] ch1 = words[0].toCharArray();
	static char[] ch2 = words[1].toCharArray();
	static char[][] myChars = { {'i','a','d','c','a'},
								{'n','i','a','h','j'},
								{'d','d','i','i','e'},
								{'i','n','d','n','a'},
								{'a','i','n','a','a'},
								{'c','h','i','n','a'}};
	static void forward(){
		findforwardIndia();
		findforwardChina();
	}	
	
//	static void backward(){
//		findbackIndia();
//		findbackChina();
//	}
//	
//	static void findbackIndia(){
//		int r = 0, c;
//		//System.out.println("Inside findindia function");
//
//		for(int row = 0 ; row < myChars.length ; row++){
//			int flag = 0;
//			for(int col = myChars[row].length-1 ; col >= 0; col--){
//				if(ch1[col]==myChars[row][col]){
//					flag++;
//					r = row;
//					c = col;
//				}
//			}
//			if(flag==5){
//				System.out.println("Found india");
//					for(c = myChars[r].length-1; c >= 0; c--){
//						if(ch1[c]==myChars[r][c]){
//							 System.out.println(ch1[c] + " at" + " (" + r + ","+ c + ") " );
//						}						
//					}
//			}
//		}
//		
//	}
//	
//	static void findbackChina(){
//		
//		int r = 0, c;
//		//System.out.println("Inside findchina function");
//
//		for(int row = 0 ; row < myChars.length ; row++){
//			int flag = 0;
//			for(int col = myChars[row].length-1; col >= 0; col--){
//				if(ch2[col]==myChars[row][col]){
//					flag++;
//					r = row;
//					c = col;
//				}
//			}
//			if(flag==5){
//				System.out.println("Found china");
//					for(c = myChars[r].length-1; c >=0; c--){
//						if(ch2[c]==myChars[r][c]){
//							 System.out.println(ch2[c] + " at" + " (" + r + ","+ c + ") " );
//						}						
//					}
//			}
//		}
//		
//	}
	
	static void findforwardIndia(){
		int r = 0, c;
		//System.out.println("Inside findindia function");

		for(int row = 0 ; row < myChars.length; row++){
			int flag = 0;
			for(int col = 0; col <myChars[row].length; col++){
				if(ch1[col]==myChars[row][col]){
					flag++;
					r = row;
					c = col;
				}
			}
			if(flag==5){
				System.out.println("Found india");
					for(c = 0; c <myChars[r].length; c++){
						if(ch1[c]==myChars[r][c]){
							 System.out.println(ch1[c] + " at" + " (" + r + ","+ c + ") " );
						}						
					}
			}
		}
		
	}
	
	static void findforwardChina(){
		
		int r = 0, c;
		//System.out.println("Inside findchina function");

		for(int row = 0 ; row < myChars.length; row++){
			int flag = 0;
			for(int col = 0; col <myChars[row].length; col++){
				if(ch2[col]==myChars[row][col]){
					flag++;
					r = row;
					c = col;
				}
			}
			if(flag==5){
				System.out.println("Found china");
					for(c = 0; c <myChars[r].length; c++){
						if(ch2[c]==myChars[r][c]){
							 System.out.println(ch2[c] + " at" + " (" + r + ","+ c + ") " );
						}						
					}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trying to find india and china in forward direction");
		forward();
		//backward();
	}

}
