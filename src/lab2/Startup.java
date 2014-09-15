package lab2;

import java.util.Scanner;
/**
 *
 * @author David Phelps
 */
public class Startup {
    
    public static void main(String[] args) {
    
    // Seemed like the property had to be initialized
    String courseNumber = null;
        
    // new scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
        
    // Asking user for course
    System.out.println("Which programming course are you in?");
    System.out.println("For Intro to Programming, enter number 1");
    System.out.println("For Intro to Java, enter number 2");
    System.out.println("For AdvancedJavaCourse, enter number 3");
    int numberInput = keyboard.nextInt();
    keyboard.nextLine();
    
    // Decision structure for course name, based on user input
    if (numberInput == 1) {
        //instantiate IntroToProgrammingCourse
        IntroToProgrammingCourse student1 = new IntroToProgrammingCourse
        (courseNumber);
        
        // Asking user for course number
        System.out.println("What is your course number? ");
        courseNumber = keyboard.nextLine();
        
        // Outputting the information
        System.out.println("");
        System.out.println("Course Name: Intro to Programming");
        System.out.println("Course Number: " + student1.getCourseNumber());
        }
    else if (numberInput == 2) {
        //instantiate IntroJavaCourse
        IntroJavaCourse student1 = new IntroJavaCourse
        (courseNumber);
        
        // Asking user for course number
        System.out.println("What is your course number? ");
        courseNumber = keyboard.nextLine();
        
        // Outputting the information
        System.out.println("");
        System.out.println("Course Name: Intro to Java");
        System.out.println("Course Number: " + student1.getCourseNumber());
        }
    else if (numberInput ==3 ) {
        //instantiate AdvancedJavaCourse
        AdvancedJavaCourse student1 = new AdvancedJavaCourse
        (courseNumber);
        
        // Asking user for course number
        System.out.println("What is your course number? ");
        courseNumber = keyboard.nextLine();
        
        // Outputting the information
        System.out.println("");
        System.out.println("Course Name: Advanced Java");
        System.out.println("Course Number: " + student1.getCourseNumber());
        }
    
    else // Error message for users who enter a number that is not 1 - 3
        System.out.println("You entered an invalid value. Please enter a "
                + "number between 1 - 3.");
    
    }
}
