
public class ParameterizedConst {

	public ParameterizedConst() {
		System.out.println("Default Cons");
	}
	
	public ParameterizedConst(String value) {
		this();
		System.out.println("Parameterized Cons");
	}
	
	
	public static void main(String[] args) {
			new ParameterizedConst("Params");
	}

}
