import java.io.*;
public class SerialDeserial {

	/**
	 *
	 *
	 *A FileOutputStream is created that refers to a file named “serial,” and an
ObjectOutputStream is created for that file stream. The writeObject( ) method
of ObjectOutputStream is then used to serialize our object. The object output
stream is flushed and closed.
A FileInputStream is then created that refers to the file named “serial,” and
an ObjectInputStream is created for that file stream. The readObject( ) method of
ObjectInputStream is then used to deserialize our object. The object input stream
is then closed.
Note that MyClass is defined to implement the Serializable interface. If this is not
done, a NotSerializableException is thrown.
	 *
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Serializing an Object
		MyClass object1;
		object1 = new MyClass("Hello", 10, 2.54e54);
		System.out.println("Object1: " + object1);
		FileOutputStream fos = new FileOutputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(object1);
		oos.flush();
		oos.close();
		
		//Deserializing an Object
		MyClass object2;
		FileInputStream fis = new FileInputStream("C:/Users/RAKESH/Desktop/MyFile.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		object2 = (MyClass) ois.readObject();
		ois.close();
		System.out.println("\nObject2: " + object2);
	}

}

class MyClass implements Serializable{
	
	String s;
	int i;
	double d;
	
	MyClass(String s, int i, double d){
		this.s = s;
		this.i = i;
		this.d = d;
	}
	
	public String toString(){
		return "s = " + s + "\ni = " + i + "\nd = " + d;
	}
	
}














