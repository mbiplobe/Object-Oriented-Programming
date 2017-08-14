package Inheritance.Lecture_1;

import java.util.ArrayList;

public class Person {
	
	private String name;
	private String id;
	
	private boolean student ;
	private boolean graduate;
	private boolean fulltime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isStudent() {
		return student;
	}
	public void setStudent(boolean student) {
		this.student = student;
	}
	public boolean isGraduate() {
		return graduate;
	}
	public void setGraduate(boolean graduate) {
		this.graduate = graduate;
	}
	public boolean isFulltime() {
		return fulltime;
	}
	public void setFulltime(boolean fulltime) {
		this.fulltime = fulltime;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Faculty List");
		displayList(getFacultyList());
		
		System.out.println("Student List");
		displayList(getStudentList());
		
		
		
	}
	
	private static void displayList(ArrayList<Person> persons){
		
	for(Person person:persons){
		String details=
			person.getId()+" "+person.getName()+" "+person.isGraduate()+" "+person.isFulltime();
		System.out.println(details);
	
	}
	}
	
/*	private static void displayStudentList(ArrayList<Person> persons){
		
	for(Person person:persons){
		String details=
			person.getId()+" "+person.getName()+" "+person.isGraduate()+" "+person.isFulltime();
	System.out.println(details);
	}
	}*/
	
	private  static ArrayList<Person> getFacultyList(){
		
		ArrayList<Person> facultyList=new ArrayList();
		
		for(int i=0;i<6;i++){
			Person person=new Person();
			person.setName("K"+i);
			person.setId(Integer.toString(i+1));
			if(i%2==0){
				person.setFulltime(false);
			}else{
				person.setFulltime(true);
			}
			
			/*Confusion: What will be Gradute Status?*/
		
			facultyList.add(person);
		}
		
		return facultyList;
	}
	
private static ArrayList<Person> getStudentList(){
		
		ArrayList<Person> studentList=new ArrayList();
		
		for(int i=0;i<6;i++){
			Person person=new Person();
			person.setName("K"+i);
			person.setId(Integer.toString(i+1));
			if(i%2==0){
				person.setGraduate(false);
			}else{
				person.setGraduate(true);
			}
			
			/*Confusion: What will be Faculty Type?*/
		
			studentList.add(person);
		}
		
		return studentList;
	}
	


}
