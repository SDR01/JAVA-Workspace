package com.masai;

public class Student {
	
	int roll = 10;
	String  name = "delta";
	int marks = 83;
	
	void displayStudentDetails() {
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello");
		Student s1 = new Student();
		s1 = null;
		s1.displayStudentDetails();
		
		Student s2 = new Student();
		s2 = null;
		s2.displayStudentDetails();
	}

}
