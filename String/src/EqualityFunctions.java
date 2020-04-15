
public class EqualityFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Sachin";
		String s2 = s1;
		String s3 = "sacHin";
		String s4 =  new String("Sachin");
		
		
		//equals() and equalsIgnoreCase()
		System.out.println("equals() and equalsIgnoreCase() : ");
		System.out.println(s1.equals(s2)); 				//true
		System.out.println(s1.equals(s3)); 				//false
		System.out.println(s1.equals(s4)); 				//true
		System.out.println(s1.equalsIgnoreCase(s3));	//true		
		
		//== operator
		System.out.println("\n== operator");
		System.out.println(s1 == s2);					//true
		System.out.println(s1 == s3);					//false
		System.out.println(s1 == "Sachin");				//true
		System.out.println("SACHIn" == "Sachin");		//false
		System.out.println("Sachin" == "Sachin");		//true
		System.out.println(s1 == s4);					//false
		
		
		String s5 = "Ratan";
		String s6 = "Schin";
		System.out.println("compareTo() : ");
		System.out.println(s1.compareTo(s2)); 				//0
		System.out.println(s1.compareTo(s5)); 				//1
		System.out.println(s5.compareTo(s2)); 				//-1
		System.out.println(s6.compareTo(s1)); 				//2
				
	}

}
