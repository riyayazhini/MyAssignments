package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Riya");
	}
	public void studentDept() {
		System.out.println("CSC");
	}
	public void studentID(){
		System.out.println("21CSC100");
	}
	

	public static void main(String[] args) {
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.studentDept();
		student.studentID();
		student.studentName();
		student.departmentName();
	}

}
