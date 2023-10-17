package myTest.manyToMany.test;

public class GradeReceived {
	Student s;
	Section sec;
	
	GradeReceived() {
		
	}
	
	public GradeReceived(Student s, Section sec) {
		this.s = s;
		this.sec =sec;
	}
}
