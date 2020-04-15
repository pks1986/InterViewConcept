import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]){  
		  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(110,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(121,"Vijay");  
		  hm.put(133,"Rahul");  
		  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		 }  

}
