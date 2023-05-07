package org.student;

import org.department.Department;

public class Student extends Department {

	
	public void studentName() {

		System.out.println("Student Name");
	}
    public void studentDept() {
	System.out.println("Student Department");	
		
	}
    public void studentId() {
	System.out.println("Student ID");
}
    public static void main(String[] args) {
		
    	Student stud = new Student();
    	
    	stud.collegeCode();
    	stud.collegeName();
    	stud.collegeRank();
    	stud.deptName();
    	stud.studentDept();
    	stud.studentId();
    	stud.studentName();
	}
	
	
	
	
}
