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
        
    IntroJavaCourse student1 = new IntroJavaCourse();
    student1.setCourseName(courseName);
    student1.setCourseNumber(courseNumber);
    
    
    System.out.println("The course name is: " 
            + student1.getCourseName());
    
    System.out.println("The course number is: " 
            + student1.getCourseNumber());
    
    }
}


