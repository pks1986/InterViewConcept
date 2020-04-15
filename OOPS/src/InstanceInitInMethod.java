
public class InstanceInitInMethod {
	InstanceInitInMethod(){
		{
			System.out.println("Inside Constructor");
		}
	}
	int number;
		void display(){
			
			System.out.println(number);
			{
				number=5;
				System.out.println("Inside Method");
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitInMethod ob = new InstanceInitInMethod();
		ob.display();

	}

}
