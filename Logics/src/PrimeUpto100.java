
public class PrimeUpto100 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 2; i <= 1000; i++){
			int flag = 0;
			
			for(int j = 2; j < i; j++){
				if(i%j == 0){
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
		}

	}

}
