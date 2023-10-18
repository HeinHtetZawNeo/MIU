package classExercies.lecture8;

import java.util.function.Consumer;

class Myinter implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}

	

	
	
}