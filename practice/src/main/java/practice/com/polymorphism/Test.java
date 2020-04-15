package practice.com.polymorphism;



class GFG 
{ 
	int i=10;
    protected int getData() 
    { 
        System.out.println("Inside GFG");
        return i;
    } 
} 
class GeeksforGeeks extends GFG 
{ 
	int i=20;
    protected int getData() 
    { 
        System.out.println("Inside GeeksforGeeks"); 
        return i;
    } 
} 

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) 
    { 
        GFG obj = new GeeksforGeeks(); 
        obj.getData();
        
        GFG obj1 = new GFG(); 
        obj1.getData();
        
        GeeksforGeeks obj2 = new GeeksforGeeks(); 
        obj2.getData();
        
        GeeksforGeeks obj3 = (GeeksforGeeks) new GFG(); 
        obj3.getData();
    } 

}
