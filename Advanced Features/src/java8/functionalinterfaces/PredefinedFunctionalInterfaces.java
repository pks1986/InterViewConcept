package java8.functionalinterfaces;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongSupplier;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;
import java.util.function.UnaryOperator;

public class PredefinedFunctionalInterfaces {

	public static void main(String[] args) {
		
		//java.util.function.Consumer<T>
		//java.util.function.BiConsumer<T, U>
		//java.util.function.IntConsumer
		//java.util.function.LongConsumer
		//java.util.function.DoubleConsumer
		//java.util.function.ObjIntConsumer<T>
		//java.util.function.ObjDoubleConsumer<T>
		//java.util.function.ObjLongConsumer<T>
		
		//java.util.function.Supplier<T>
		//java.util.function.BooleanSupplier
		//java.util.function.IntSupplier
		//java.util.function.DoubleSupplier
		//java.util.function.LongSupplier
		
		//java.util.function.Predicate<T>
		//java.util.function.BiPredicate<T, U>
		//java.util.function.IntPredicate
		//java.util.function.DoublePredicate
		//java.util.function.LongPredicate
		
		//java.util.function.Function<T, R>
		//java.util.function.BiFunction<T, U, R>
		
		//java.util.function.IntFunction<R>
		//java.util.function.DoubleFunction<R>
		//java.util.function.LongFunction<R>
		
		//java.util.function.IntToDoubleFunction
		//java.util.function.IntToLongFunction
		//java.util.function.DoubleToIntFunction
		//java.util.function.DoubleToLongFunction
		//java.util.function.LongToIntFunction
		//java.util.function.LongToDoubleFunction
		
		//java.util.function.ToIntBiFunction<T, U>
		//java.util.function.ToDoubleBiFunction<T, U>
		//java.util.function.ToDoubleFunction<T>
		//java.util.function.ToLongBiFunction<T, U>
		//java.util.function.ToLongFunction<T>
		
		//java.util.function.BinaryOperator<T>
		//java.util.function.UnaryOperator<T>
		//java.util.function.IntBinaryOperator
		//java.util.function.IntUnaryOperator
		//java.util.function.DoubleBinaryOperator
		//java.util.function.DoubleUnaryOperator
		//java.util.function.LongBinaryOperator
		//java.util.function.LongUnaryOperator
			
		
		// Implementation of Consumers
		
		// Represents an operation that accepts a single input argument and returns no result. 
		// the type of the input to the operation
		new Consumer<Product>() {
			@Override
			public void accept(Product t) {
			}
		};
		
		// Represents an operation that accepts two input arguments and returns no result.
		// the type of the first argument to the operation
		//the type of the second argument to the operation
		new BiConsumer<Product, Product>() {
			@Override
			public void accept(Product p1, Product p2) {				
			}
		};

		// Represents an operation that accepts a single int-valued argument and returns no result. 
		new IntConsumer() {
			@Override
			public void accept(int value) {
			}
		};
		
		// Represents an operation that accepts a single double-valued argument and returns no result. 
		new DoubleConsumer() {
			@Override
			public void accept(double value) {
			}
		};
		
		// Represents an operation that accepts a single long-valued argument and returns no result. 
		new LongConsumer() {
			@Override
			public void accept(long value) {
			}
		};
		
		// Represents an operation that accepts an object-valued and a int-valued argument, and returns no result.
		// the type of the object argument to the operation
		new ObjIntConsumer<Product>() {
			@Override
			public void accept(Product t, int value) {
			}
		};
		
		// Represents an operation that accepts an object-valued and a double-valued argument, and returns no result. 
		// the type of the object argument to the operation
		new ObjDoubleConsumer<Product>() {
			@Override
			public void accept(Product t, double value) {
			}
		};
		
		// the type of the object argument to the operation
		new ObjLongConsumer<Product>() {
			@Override
			public void accept(Product t, long value) {
			}
		};
		
		
		// Implementation of Suppliers
		
		//the type of results supplied by this supplier
		new Supplier<Product>() {
			@Override
			public Product get() {
				return null;
			}
		};
		
		// Represents a supplier of boolean-valued results. This is the boolean-producing primitive specialization of Supplier. 
		new BooleanSupplier() {
			@Override
			public boolean getAsBoolean() {
				return false;
			}
		};
		
		// Represents a supplier of int-valued results.
		new IntSupplier() {
			@Override
			public int getAsInt() {
				return 0;
			}
		};
		
		// Represents a supplier of double-valued results.
		new DoubleSupplier() {
			@Override
			public double getAsDouble() {
				return 0.0d;
			}
		};
		
		// Represents a supplier of long-valued results.
		new LongSupplier() {
			@Override
			public long getAsLong() {
				return 0;
			}
		};
		
		
		// Implementation of Predicates
		
		// Represents a supplier of long-valued results.
		// the type of the input to the predicate
		new Predicate<Product>() {
			@Override
			public boolean test(Product t) {
				return false;
			}
		};
		
		// Represents a predicate (boolean-valued function) of two arguments.
		// the type of the first argument to the predicate
		// the type of the second argument the predicate
		new BiPredicate<Product, Product>() {
			@Override
			public boolean test(Product p1, Product p2) {
				return false;
			}
		};
		
		// Represents a predicate (boolean-valued function) of one int-valued argument. 		
		new IntPredicate() {
			@Override
			public boolean test(int value) {
				return false;
			}
		};
		
		// Represents a predicate (boolean-valued function) of one double-valued argument. 
		new DoublePredicate() {
			@Override
			public boolean test(double value) {
				return false;
			}
		};
		
		// Represents a predicate (boolean-valued function) of one double-valued argument. 
		new LongPredicate() {
			@Override
			public boolean test(long value) {
				return false;
			}
		};
		
		
		// Implementations of Functions
		
		// Represents a function that accepts one argument and produces a result.
		//<T> the type of the input to the function
		//<R> the type of the result of the function
		new Function<Product, Integer>() {
			@Override
			public Integer apply(Product t) {
				return t.getId();
			}
		};
		
		// Represents a function that accepts two arguments and produces a result.
		//<T> the type of the first argument to the function
		//<U> the type of the second argument to the function
		//<R> the type of the result of the function
		new BiFunction<Product, Product, Float>() {
			@Override
			public Float apply(Product t, Product u) {
				return t.getPrice() + t.getPrice();
			}
		};
		
		// Represents a function that accepts an int-valued argument and produces a result.
		//<R> the type of the result of the function
		new IntFunction<String>() {
			@Override
			public String apply(int value) {
				if(value < 9) {
					return "0" + value;
				} else {
					return String.valueOf(value);
				}
			}
		};
		
		// Represents a function that accepts a double-valued argument and produces a result.
		//<R> the type of the result of the function
		new DoubleFunction<String>() {
			@Override
			public String apply(double value) {
				return String.valueOf(value);
			}
		};
		
		// Represents a function that accepts a long-valued argument and produces a result.
		//<R> the type of the result of the function
		new LongFunction<String>() {
			@Override
			public String apply(long value) {
				return String.valueOf(value);
			}
		};
		
		// Represents a function that accepts an int-valued argument and produces a double-valued result. 
		new IntToDoubleFunction() {
			@Override
			public double applyAsDouble(int value) {
				return value;
			}
		};
		
		// Represents a function that accepts an int-valued argument and produces a long-valued result.
		new IntToLongFunction() {
			@Override
			public long applyAsLong(int value) {
				return value;
			}
		};
		
		// Represents a function that accepts a double-valued argument and produces an int-valued result. 
		new DoubleToIntFunction() {
			@Override
			public int applyAsInt(double value) {
				return (int)value;
			}
		};
		
		// Represents a function that accepts a double-valued argument and produces a long-valued result.
		new DoubleToLongFunction() {
			@Override
			public long applyAsLong(double value) {
				return (long) value;
			}
		};
		
		// Represents a function that accepts a long-valued argument and produces an int-valued result.
		new LongToIntFunction() {
			@Override
			public int applyAsInt(long value) {
				return (int) value;
			}
		};
		
		// Represents a function that accepts a long-valued argument and produces a double-valued result. 
		new LongToDoubleFunction() {
			@Override
			public double applyAsDouble(long value) {
				return value;
			}
		};
		
		// Represents a function that accepts two arguments and produces an int-valued result. 
		// <T> the type of the first argument to the function
		// <U> the type of the second argument to the function
		new ToIntBiFunction<Product, Product>() {
			@Override
			public int applyAsInt(Product t, Product u) {
				return t.getId() + u.getId();
			}
		};
		
		// Represents a function that accepts two arguments and produces a double-valued result.
		// <T> the type of the first argument to the function
		// <U> the type of the second argument to the function
		new ToDoubleBiFunction<Product, Product>() {
			@Override
			public double applyAsDouble(Product t, Product u) {
				return t.getPrice();
			}
		};
		
		// Represents a function that produces a double-valued result.
		// <T> the type of the input to the function
		new ToDoubleFunction<Product>() {
			@Override
			public double applyAsDouble(Product value) {
				return value.getPrice();
			}
		};
		
		// Represents a function that accepts two arguments and produces a long-valued result.
		// <T> the type of the first argument to the function
		// <U> the type of the second argument to the function
		new ToLongBiFunction<Product, Product>() {
			@Override
			public long applyAsLong(Product t, Product u) {
				return t.getId() + u.getId();
			}			
		};
		
		// Represents a function that produces a long-valued result. 
		// <T> the type of the input to the function
		new ToLongFunction<Product>() {
			@Override
			public long applyAsLong(Product value) {
				return value.getId();
			}
		};
		
		
		// Implementation of UnaryOperator
		
		// Represents an operation on a single operand that produces a result of the same type as its operand.
		// <T> the type of the operand and result of the operator
		new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t) {
				return t + 10;
			}
		};
		
		// Represents an operation on a single int-valued operand that produces an int-valued result. 
		new IntUnaryOperator() {
			@Override
			public int applyAsInt(int operand) {
				return operand * 10;
			}
		};
		
		// Represents an operation on a single double-valued operand that produces a double-valued result. 
		new DoubleUnaryOperator() {			
			@Override
			public double applyAsDouble(double operand) {
				return operand + 5.5d;
			}
		};

		// Represents an operation on a single long-valued operand that produces a long-valued result.
		new LongUnaryOperator() {
			@Override
			public long applyAsLong(long operand) {
				return operand + 100;
			}
		};
		
		
		// Implementation of BinaryOperator(s)
		
		// <T> the type of the operands and result of the operator
		new BinaryOperator<Product>() {
			@Override
			public Product apply(Product t, Product u) {
				return new Product(101, "Combo Product", t.getPrice() + u.getPrice() - 100);
			}
		};
		
		// Represents an operation upon two int-valued operands and producing an int-valued result. 
		new IntBinaryOperator() {
			@Override
			public int applyAsInt(int left, int right) {
				return left * right;
			}
		};
		
		// Represents an operation upon two double-valued operands and producing a double-valued result.
		new DoubleBinaryOperator() {
			@Override
			public double applyAsDouble(double left, double right) {
				return left + right;
			}
		};
		
		// Represents an operation upon two long-valued operands and producing a long-valued result
		new LongBinaryOperator() {
			@Override
			public long applyAsLong(long left, long right) {
				return left + right;
			}
		};
	}
}
