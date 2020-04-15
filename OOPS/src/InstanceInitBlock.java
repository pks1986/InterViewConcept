
public class InstanceInitBlock {
	int number;
	int i;
	{
		System.out.println("First Instance Initializer block");
		while(i < 5){
			System.out.println(i);
			i++;
		}
		number = 10;
	}
	{
		System.out.println("Second Instance Initializer block");
	}
	void display(){
		System.out.println(number);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceInitBlock ob = new InstanceInitBlock();
		new InstanceInitBlock().display();
		ob.display();

	}

}
