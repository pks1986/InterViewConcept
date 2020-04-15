
public class parseXxx_valueOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d4 = Double.parseDouble("3.14");
		System.out.println("d4 = " + d4);
		
		Double d5 = Double.valueOf("3.15");
		//sdouble d5 = Double.valueOf("3.15");
		System.out.println("d5 = " + d5);
		System.out.println( d5 instanceof Double);
		
		//System.out.println( d4 instanceof Double);		
		
		Double d6 = Double.parseDouble("3.14");
		System.out.println( d6 instanceof Double);
		
		
		//This format is no working on float and double
		Long d7 = Long.valueOf("1101", 2);
		System.out.println(d7);

	}

}
