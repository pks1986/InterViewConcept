class Myclone implements Cloneable{
	int num;
	String name;
	
	Myclone(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	void print(){
		System.out.println(num + " " + name);
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloneEx {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Myclone ob = new Myclone(10, "Tennis");
		ob.print();
		Myclone ob2 = (Myclone)ob.clone();
		ob2.print();
	}

}
