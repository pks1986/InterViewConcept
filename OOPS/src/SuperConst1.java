class Super1{
	int speed = 59;
	Super1(int s){
		
	}
}
class Super2 extends Super1{
	int speed;
	Super2(int speed){
		super(speed);
		this.speed = speed;
		
	}
	void display(){
		System.out.println("Speed: " + super.speed);
	}
}
public class SuperConst1 {

	/**
	 * Whether super is calling super class constructor or not
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 ob = new Super2(10);
		ob.display();

	}

}
