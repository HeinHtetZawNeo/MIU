package lessons.lesson10.lecture.exceptions3;

import static lessons.lesson10.lecture.exceptions3.FunctionWithException.unchecked;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenericWrapper {
	public List<String> getCanonicalPaths(String[] dirs)  {
		return Stream.of(dirs).map(path -> unchecked((String p) ->
				new File(p).getCanonicalPath()).apply(path))
			.map(Object::toString).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		//causes IOException -- but instead of handling it, we get RuntimeException
		String[] localDirs = {"/usr", "//usr", "/etc"};
		List<String> canonicalPaths 
			= (new GenericWrapper()).getCanonicalPaths(localDirs);
		System.out.println(canonicalPaths);
	}
	
	
	
	
	
}
