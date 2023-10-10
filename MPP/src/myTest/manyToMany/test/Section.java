package myTest.manyToMany.test;

import java.util.ArrayList;
import java.util.List;

public class Section {
	List<Student> studentList;
	List<GradeReceived> gradeList;
	
	public Section() {
		studentList = new ArrayList<Student>();
		gradeList = new ArrayList<GradeReceived>();
	}
}
