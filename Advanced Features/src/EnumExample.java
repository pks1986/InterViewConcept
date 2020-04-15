
public class EnumExample {
	
	enum season {SUMMER, SPRING, WINTER, FALL };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(season ee: season.values()){
			System.out.println(ee);
		}
	}

}
