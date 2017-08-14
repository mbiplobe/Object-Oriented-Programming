package Inheritance.Lecture_6;

public class Presenter6 {

	public static void main(String[] args) {
		

	}
	
	private class Student extends Person{
		
		public Student(){
			super();
		}
		
		public Student(String studentName){
			super(studentName);
			this.Name=studentName;
		
		}
	}
	private class Person{
		String Name;
		public Person(){
			super();
		}
		public Person(String name){
			super();
		}
	}
	
	private class Faculty extends Student{
		
		public Faculty(){
			super();
		}
	}

}
