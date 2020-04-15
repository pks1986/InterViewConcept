import java.util.StringTokenizer;


public class SThasnext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer st = new StringTokenizer("My Name is Khan");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
//		while(st.hasMoreElements()){
//			System.out.println(st.nextElement());
//		}

	}

}
