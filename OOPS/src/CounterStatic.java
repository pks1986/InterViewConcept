
public class CounterStatic {
	static int counter;
	static{
		counter = 1;
	}
	void counterInc(){
		counter++;
	}
	void display(){
		System.out.println("Value of counter: " + counter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CounterStatic ob1 = new CounterStatic();
		CounterStatic ob2 = new CounterStatic();
		//ob1.display();
		ob1.counterInc();
		ob1.counterInc();
		ob1.display();
		
		ob2.display();
		ob2.counterInc();
		ob2.counterInc();
		ob2.display();
		ob1.display();

	}

}
