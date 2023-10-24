package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		/*Student stul1 = new Student();	
		stul.enroll();
		stul.payTuition();
		stul.viewBalance();
		System.out.println(stul.toString());
			
		Student stul2 = new Student();	
		stul2.enroll();
		stul2.payTuition();
		stul2.viewBalance();
		System.out.println(stul2.toString());
		
		Student stul3 = new Student();	
		stul3.enroll();
		stul3.payTuition();
		stul3.viewBalance();
		System.out.println(stul3.toString()); */
		
		// How many new students we want to add
		System.out.print("Enter number of new students");
		Scanner in = new Scanner (System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		// Create n number of new students. Loop through an array
		for (int i = 0; i < numOfStudents; i++) {
			Student stu = new Student();	
			stu.enroll();
			stu.payTuition();
			stu.viewBalance();
			System.out.println(stu.toString());
		
		}

	}

}
