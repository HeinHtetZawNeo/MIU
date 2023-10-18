package classExercise.day9;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class exe1 {

	public static void main(String[] args) {
		char[] chaList = { '1', 'b', 'c' };

		String s1 = new String(chaList);

		Function<char[], String> fun1 = (x) -> new String(x);
		String s2 = fun1.apply(chaList);

		char[] chaList1 = { '1', 'b', 'c' };

		Function<char[], String> fun2 = String::new;
		String s3 = fun2.apply(chaList1);
		// OR
		String s4 = ((Function<char[], String>) (String::new)).apply(chaList1);

		System.out.println(s4);
	}

}
