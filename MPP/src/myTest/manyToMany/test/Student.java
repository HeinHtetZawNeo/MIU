package myTest.manyToMany.test;

import java.util.ArrayList;
import java.util.List;

public class Student {
	List<Section> sectionList;
	List<GradeReceived> gradeList;
	
	public Student() {
		sectionList = new ArrayList<Section>();
		gradeList = new ArrayList<GradeReceived>();
	}
}
