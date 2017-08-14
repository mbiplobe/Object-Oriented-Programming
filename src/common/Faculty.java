package common;

import java.util.ArrayList;

public class Faculty extends Person {

	private double salary;
	private boolean facultyType;
	private String designation;

	public Faculty() {
		super();

	}

	public Faculty(double salary, boolean facultyType, String designation) {
		super();
		this.salary = salary;
		this.facultyType = facultyType;
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isFacultyType() {
		return facultyType;
	}

	public void setFacultyType(boolean facultyType) {
		this.facultyType = facultyType;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public ArrayList<Faculty> getFacultyList() {

		ArrayList<Faculty> facultyList = new ArrayList();

		for (int i = 0; i < 6; i++) {
			Faculty faculty = new Faculty();
			
			faculty.setName("FCT" + i);
			faculty.setAddress("ADD" + i);
			faculty.setnId("1000" + i);
			faculty.setMale(true);
			
			if(i%2==0){
				faculty.setDesignation("Professor");
				faculty.setSalary(1000000*2);
				faculty.setFacultyType(true);
			}else{
				faculty.setDesignation("Lecturer");
				faculty.setSalary(500000*2);
				faculty.setFacultyType(true);
			}
			
			facultyList.add(faculty);
		

		}
		return facultyList;

	}
	
	public void displayFacultyInformation(ArrayList<Faculty> arrayList){
		for(Faculty faculty: arrayList){
			String details=faculty.getName()+" "+faculty.getnId()+" "+faculty.getAddress()
			+" "+faculty.getDesignation()+" "+faculty.getSalary();
			
			System.out.println(details);
		

		}
	}
}
