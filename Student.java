package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor to prompt student's name and year
	public Student () {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID(); // don't understand this much
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		id++;
	}
	
	// Generate an ID
	private void setStudentID(){ 
		//Grade level + id
		id++;
		this.studentID = gradeYear + "" + id; // try without return. Then check why error occurred
			
	}
		
	// Enroll in courses
	public void enroll() {
		//Get inside a loop
		do {
			System.out.print("H - History 101\nM - Mathematics 101\nE- English 101\nC - Chemistry 101\nCS - Computer Science 101\nEnter course to enroll (Q to quit): ");
			
			Scanner in = new Scanner(System.in);
			String course = in.nextLine(); // Read user input
			if (!course.equals("Q")) {
				courses = courses +"\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				System.out.println("BREAK!");
				break;
			}
		} while(1!= 0);
			
		System.out.println("Enrolled in: " + courses);
		System.out.println("Tuition fee: " + tuitionBalance);
	}
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: " + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $ " + payment);
	}
	
	//Show status
	public String showInfo() {
		return "Name: " + firstName + " " + lastName +
				"\nGradelevel " + gradeYear +
				"\nCourses Enrolled: " + courses +
				"\nBalance: $" + tuitionBalance;
		
	}

}
