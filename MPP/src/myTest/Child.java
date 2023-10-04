package myTest;

import java.util.List;

public class Child extends MyAbstract{

	private List<Child> childList;
	@Override
	public void count() {
		System.out.println("I am here");
	}

}
