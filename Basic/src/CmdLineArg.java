public class CmdLineArg {
	
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(args[0]);
		float n2 = Float.parseFloat(args[1]);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(args[2]);
		System.out.println(args[3]);
	
	}

}
