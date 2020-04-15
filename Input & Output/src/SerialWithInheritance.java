import java.io.*;

public class SerialWithInheritance {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//Serializing an Object
		MyClass3 ob3 = new MyClass3("Yadav", "Rakesh", 103);
//		System.out.println("Object Value before Serialization:\n" + ob3);
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob3);
		
		//Changing value of static variable which will not be serialized
		
		new MyClass3("Kumar", "Sumit", 73);
		
		//Deserializing an Object
		MyClass3 obj4;
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj4 = (MyClass3) ois.readObject();
		
		System.out.println("Object After Deserialization:\n" + obj4);
		
	}

}

class MyClass2 implements Serializable{	
	
}

class MyClass3 extends MyClass2{
	static String sname ;
	String fname;
	int id2;
	MyClass3(String sname, String fname, int id2){
		this.sname = sname;
		this.fname = fname;
		this.id2 = id2;
	}
	
	public String toString(){
		return "First name: " + fname + "\nSecond name = " + sname + "\nid2 = " + id2;
	}
	
}













