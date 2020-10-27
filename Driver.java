package schoolManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	public static void printCourse(ArrayList<Class> courses) {
		for(Class c : courses) {
			System.out.println("Course name is " + c.getCourseName() + 
					           " which takes " + c.getDuration() + " weeks.\n" +
					           "The instructor of this course is " + c.getInstructor().getFirstName() +
					           " " + c.getInstructor().getLastName() + 
					           " with " + c.getInstructor().getStatus() + 
					           " who is " + c.getInstructor().getExperienceYear() +
					           " year of experience. \nThe phone Number of instructor is " + c.getInstructor().getPhoneNumber() + "\n");
		}
	}
	
	public static void findCourse(ArrayList<Class> courses, String enteredName) {
		for(Class s : courses) {
			if(s.getInstructor().getFirstName().equalsIgnoreCase(enteredName)) {
				System.out.println("The course is " + s.getCourseName());
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Class> courses = new ArrayList<Class>();
		
		Instructor instructor1 = new Instructor("Sarah", "Apple", "111-222-333", 2);
		Class class1 = new Class("Jave", 6, instructor1);
		Instructor instructor2 = new Instructor("James", "Holl", "444-555-666", 4);
		Class class2 = new Class("JavaScript", 4, instructor2);
		Instructor instructor3 = new Instructor("Deniss", "Fane", "777-888-999", 1);
		Class class3 = new Class("Pythos", 8, instructor3);
		Instructor instructor4 = new Instructor("Deniss", "Fane", "123-456-789", 0);
		Class class4 = new Class("Pythos", 3, instructor4);

		courses.add(class1);
		courses.add(class2);
		courses.add(class3);
		courses.add(class4);


		printCourse(courses);
		
		System.out.print("Please enter first name of your instructor : ");
		String enteredName = input.next();
		findCourse(courses, enteredName);
		
	}

}
