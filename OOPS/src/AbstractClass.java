import java.util.Scanner;

abstract class Figure{
	double dim1, dim2, area;
	Figure(){	
	}
	Figure(double dim1, double dim2){
		this.dim1 = dim1;
		this.dim2 = dim2;
		//System.out.println(this);
	}
	void display(){
		System.out.println("Display method called");
	}
	abstract double area();
	
}
class Triangle extends Figure{
	Triangle(){
		
	}
	Triangle(double dim1, double dim2){
		super(dim1, dim2);
	}
	double area(){
		return dim1*dim2/2;
	}
}
class Rectangle extends Figure{
	Rectangle(){
		
	}
	Rectangle(double dim1, double dim2){
		super(dim1, dim2);
	}
	double area(){
		return dim1*dim2;
	}
}
public class AbstractClass {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int dim1, dim2;
//		System.out.println("Enter dimension1: ");
//		dim1 = sc.nextInt();
//		System.out.println("Enter dimension2: ");
//		dim2 = sc.nextInt();
		Figure tri = new Triangle(10, 10);
		Figure rect = new Rectangle(10, 10);
		
		System.out.println("Area of Triangle: " + tri.area());
		tri.display();
		System.out.println("Area of Rectangle: " + rect.area());

	}

}
