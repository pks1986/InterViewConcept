package java8.lambdaexpression;

interface Drawable {
	void draw(String message);
}

interface Addable {
	int add(int a, int b);
}

public class LambdaExpressionWithParamenters {

	public static void main(String args[]) {
				
		//With Parenthesis
		Drawable withLambda = (strVal)->{
			System.out.println(strVal);
		};
		withLambda.draw("With parenthesis...");		
		
		//Without Parenthesis for Single Parameter only
		Drawable withoutParenthesis = strVal ->{
			System.out.println(strVal);
		};
		withoutParenthesis.draw("Without Parenthesis for single paremeter only...");
		
		// Multiple parameters in lambda expression  with datatype
		Addable withDataType = (int a, int b)->{
			return (a + b);
		};
		System.out.println("Without Datatype: Result: " + (withDataType.add(5, 10)));
		
		// Multiple parameters with data type in lambda expression  
		Addable withoutDataType = (a, b)->{
			return (a + b);
		};
		System.out.println("Witht Datatype: Result: " + (withoutDataType.add(50, 100)));
		
	}
	//End of main()
}
