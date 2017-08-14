package Inheritance.lecture_3;

import common.Faculty;
import common.Person;
import common.Student;

public class Presenter {

	public static void main(String[] args) {
		
		/*Valid Expression*/
		Student student;/* Reference Type*/
		student=new Student(); /*Object Type*/
		
		Faculty faculty;/* Reference Type*/
		faculty=new Faculty(); /*Object Type*/
		
		
		Person personStudent=new Student();
		
		/*Valid Accessibility*/
		personStudent.getAddress();
		personStudent.getName();
		personStudent.isMale();
		personStudent.getnId();
		personStudent.setAddress("Test");
		personStudent.setName("K");
		personStudent.setMale(true);
		personStudent.setnId("K");
		
		/*Invalid Accessibility
		personStudent.displayStudentInformation(personStudent.getStudentList())
		*/
	
		Person personFaclty=new Student();
		
		/*Valid Accessibility*/
		personFaclty.getAddress();
		personFaclty.getName();
		personFaclty.isMale();
		personFaclty.getnId();
		personFaclty.setAddress("Test");
		personFaclty.setName("K");
		personFaclty.setMale(true);
		personFaclty.setnId("K");
		
		/*Invalid Accessibility
		 * 	personFaclty.displayFacultyInformation(personFaclty.getFacultyList());
		 * 	personFaclty.setDesignation("Professor");
		*/
		
		/*Invalid Expression
		 * Student student1=new Person();
		 * 	Faculty Faculty2=new Person();
		*/
	
		
		
		

	}
	
	
	


}
