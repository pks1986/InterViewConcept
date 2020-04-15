import java.io.*;

public class SerialWithTransient {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//Serializing an Object
		MyClass6 ob6 = new MyClass6("Yadav", "Rakesh", 103);
//		System.out.println("Object Value before Serialization:\n" + ob3);
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob6);
		
		//Transient values are not even stored as part of serialzation
		
		new MyClass6("Budhija", "Sumit", 73);
		
		//Deserializing an Object
		MyClass6 obj7;
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		obj7 = (MyClass6) ois.readObject();
		
		System.out.println("Object After Deserialization:\n" + obj7);
		
	}

}

class MyClass5 implements Serializable{	
	
}

class MyClass6 extends MyClass5{
	transient String sname ;
	String fname;
	transient int id2;
	MyClass6(String sname, String fname, int id2){
		this.sname = sname;
		this.fname = fname;
		this.id2 = id2;
	}
	
	public String toString(){
		return "First name: " + fname + "\nSecond name = " + sname + "\nid2 = " + id2;
	}
	
}













