package java8.lambdaexpression;

interface Drawable2 {
	void draw();
}

public class LambdaExpressionNoParameter {
	public static void main(String args[]) {
		Drawable2 withoudLambda = new Drawable2() {
			@Override
			public void draw() {
				System.out.println("Without Lambda...");
			}
		};
		withoudLambda.draw();
		
		Drawable2 withLambda = ()->{
			System.out.println("With Lambda...");
		};
		withLambda.draw();		
	}
}
