package practice.com.stack;

import java.util.Stack;

public class Stack_Impl {

	
	
	
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack_push(stack);
		stack_pop(stack);
		
	}


	private static void stack_pop(Stack<Integer> stack) {
		for(int i = 0 ; i<5; i++)
		{
			Integer element = (Integer) stack.pop();
			System.out.println("pop"+element);
		}
		
	}


	private static void stack_push(Stack<Integer> stack) {
		
		for(int i = 0 ; i<5; i++)
		{
			Integer element = (Integer) stack.push(i);
			System.out.println("Push"+element);
		}
	}


	

}
