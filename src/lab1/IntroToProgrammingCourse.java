package lab1;

import javax.swing.JOptionPane;

/**
 * @author      David Phelps
 * @version     1.00
 */

public class IntroToProgrammingCourse implements WctcCourse {
    
    private String courseName;
    private String courseNumber;
    private double credits;
    
    public IntroToProgrammingCourse() {
        
    }

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber); 
    }

    
    // Getter and setter methods for all properties
    public String getCourseNumber() {
        return courseNumber;
    }

    // removed final so it can be overridden. final is only for fixed obj.    
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }
    // why is/was this method final?
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public void setCourseName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCourseNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCredits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
