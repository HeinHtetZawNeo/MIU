package myTest.manyToMany.test;

public class GradeReceived {
	Student s;
	Section sec;
	
	public GradeReceived(Student s, Section sec) {
		this.s = s;
		this.sec =sec;
	}
}
