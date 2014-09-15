package lab1;

import java.util.Scanner;
/**
 *
 * @author David Phelps
 */
public class Startup {
    
    public static void main(String[] args) {
    
    String courseName = "Introduction to Programming";
    String courseNumber = "152-101";
        
    /** using Liskov Principle, I am not able to find methods in the package.
    * I believe this is because the WctcCourse is an interface class and 
    * does not see the methods in the subclass. IN this situation, it is best
    * to NOT use the Liskov Principle.
    * 
    * The Liskov Principle is better for an Abstract or Concrete superclass
    * in my guess.
    *  
    */
    
    IntroJavaCourse student1 = new IntroJavaCourse();
    student1.setCourseName(courseName);
    student1.setCourseNumber(courseNumber);
    
    
    System.out.println("The course name is: " 
            + student1.getCourseName());
    
    System.out.println("The course number is: " 
            + student1.getCourseNumber());
    
    }
}


