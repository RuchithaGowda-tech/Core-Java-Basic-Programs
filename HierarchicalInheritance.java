// University Management
package Inheritance;
class UniversityMember {
	String name="Rahul";
	int id=501;
	
	void showMember() {
		System.out.println("Name:"+ name);
		System.out.println("ID:"+ id);
	}
}
class Student extends UniversityMember {
	String course="BCA";
	
	void showStudent() {
		System.out.println("Course:"+course);
	}
}
class Professor extends UniversityMember {
	String department="Computer Science";
	
	void showProfessor() {
		System.out.println("Department:"+department);
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Student student = new Student();
		Professor professor = new Professor();
		System.out.println("=== Student details ===");
		student.showMember();
		student.showStudent();
		
		System.out.println();
		
		System.out.println("=== Professor Details ===");
		professor.showMember();
		professor.showProfessor();
	}
}
