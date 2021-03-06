// ************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************
import java.util.Scanner;

public class Student
{
	Scanner scan = new Scanner(System.in);
	//declare instance data
	private String name;
	private int test1, test2;
	
	//constructor
	public Student(String studentName)
	{
		//add body of constructor
		this.name = studentName;
	}
	
	//inputGrades: prompt for (use Scanner) and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	public void inputGrades()
	{
		//add body of inputGrades
		System.out.println("Enter " + name + "'s score for test 1:");
		test1 = scan.nextInt();
		System.out.println("Enter " + name + "'s score for test 2:");
		test2 = scan.nextInt();
	}
	
	
	//getAverage: compute and return the student's test average
	//add header for getAverage
	public double getAverage()
	{
		//add body of getAverage
		return (test1 + test2) / 2.0;
	}
	
	
	//getName: print the student's name
	//add header for printName
	public String printName()
	{
		//add body of printName
		return name;
	}
	
	public String toString() {
		return "Student [Name: " + name + ", Test 1: " + test1 + ", Test 2: "
				+ test2 + "]";
	}


}
