package com.tka.method;

public class Main {

	public static void main(String[] args) {
		System.out.println();
		System.out.println(" ***** STUDENT INFORMATION *****");
		Student s = new Student();
		System.out.println();
		s.studentId = 101;
		s.firstName = "Vishal";
		s.lastName = "Tipe";
		s.age = 22;
		s.gender = "Male";
		s.email = "vishal@gmail.com";
		s.phoneNumber = 7887774755L;
		s.address = "Solapur";
		s.course = "B.Tech";
		s.department = "CSE";
		s.semester = 8;
		s.rollNumber = 49;
		s.dateOfBirth = "27-04-2004";
		s.attendancePercentage = 95.55;
		s.cgpa = 8.76;

		s.myInfo();
		System.out.println("----------------------");
	}

}
