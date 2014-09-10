
package lab1;

/**
 * Author David Phelps
 */

public abstract interface WctcCourse {
    
    // methods that can be inherited by subclasses
    public abstract String getCourseName();
    
    public abstract void setCourseName();
    
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber();
    
    public abstract double getCredits();
    
    public abstract void setCredits();
    
    public abstract String getPrerequisites();
    
    public abstract void setPrerequisites();
    
    
    
    public abstract double getStipends();
    
    public abstract double getSpcSalary();
    
    public abstract double setSpcSalary();
    
    public abstract double getSpcStipends();
    
    public abstract double getSpcCommission();
    
    public abstract double setSpcCommission();
    
}
    
}
