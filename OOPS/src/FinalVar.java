
public class FinalVar {
	final int num;
	FinalVar(int number){
		num = number;
	}
	
	void display(){
		//num += 5;
		final int num2;
		num2 = 35;
		//num2 = num2+5;
		
		System.out.println(num);
		System.out.println(num2);
	}
	public static void main(String[] args) {
		FinalVar fv = new FinalVar(10);
		fv.display();
		
		FinalVar fv2 = new FinalVar(20);
		fv2.display();
		}

}
