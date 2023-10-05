package myTest;

public class Main {

	public static void main(String[] args) {
		MyAbstract test = new MyAbstract() {
			
			@Override
			public void count() {
				System.out.println("I am counting");
			}
		};
		
		MyAbstract test2 = new MyAbstract() {
			
			@Override
			public void count() {
				System.out.println("I am counting 2");
			}
		};
		test = test2;
		test.count();
		test2.count();
		
		MyInterface test5 = new MyInterface() {
			
			@Override
			public void count() {
				System.out.println("I am here again");
			}
		};
		
		test5.count();
		MyAbstract child = new Child();
		child.count();
		MyAbstract child2 = new Child();
		
		child2.count();
	}

}
