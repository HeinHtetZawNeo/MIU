package classExercies.lecture8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class myexercise1 {

	public static void main(String[] args) {
		MyInterface<Integer,Integer> fun1 = (t, u) -> t + u;
		int result1 = fun1.mymethod(10, 2);

		//System.out.print(result1);

		Function<Double, Double> fun2 = (x) -> 1.6 * x;
		double result2 = fun2.apply(3.0);

		//System.out.print(result2);
		
		List<String> myList = new ArrayList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		myList.forEach(t -> {
			System.out.println(t);
		});
		Myinter temp = new Myinter();
		
		myList.forEach(new Myinter());
		
	}
	
}
