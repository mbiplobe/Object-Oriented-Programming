package common;

import java.util.ArrayList;

public class Student extends Person{
	private String cgpa;
	private boolean studentType;
	
	public Student() {
		super();
	}
	
	public Student(String cgpa, boolean studentType) {
		super();
		this.cgpa = cgpa;
		this.studentType = studentType;
	}
	
	
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	public boolean isStudentType() {
		return studentType;
	}
	public void setStudentType(boolean studentType) {
		this.studentType = studentType;
	}
	
	
	public ArrayList<Student> getStudentList() {

		ArrayList<Student> studentList = new ArrayList();

		for (int i = 0; i < 6; i++) {
			Student student = new Student();
			
			student.setName("Stu" + i);
			student.setAddress("Student Address" + i);
			student.setnId("2000" + i);
			student.setMale(false);
			
			if(i%2==0){
				student.setStudentType(true);
				student.setCgpa("3.49");
			}else{
				student.setStudentType(false);
				student.setCgpa("2.49");
			}
			
			studentList.add(student);
		

		}
		return studentList;

	}
	
	public void displayStudentInformation(ArrayList<Student> arrayList){
		for(Student student: arrayList){
			String details=student.getName()+" "+student.getnId()+" "+student.getAddress()
			+" "+student.getCgpa();
			
			System.out.println(details);

		}
	}
}
