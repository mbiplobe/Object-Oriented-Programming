package Inheritance.lecture_2;

import common.Faculty;
import common.Student;

public class Presenter {

	public static void main(String[] args) {
		
		System.out.println("Faculty Information");
		Faculty faculty=new Faculty();
		faculty.displayFacultyInformation(faculty.getFacultyList());
		
		System.out.println("Student Information");
		Student student=new Student();
		student.displayStudentInformation(student.getStudentList());
	}
	
	
	


}
