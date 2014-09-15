
package lab2;

/**
 * Author David Phelps
 */

public interface WctcCourse {
    
    // methods that can be inherited by subclasses
    public abstract String getCourseNumber();
    
    public abstract void setCourseNumber();
    
    public abstract double getCredits();
    
    public abstract void setCredits();
    
    public abstract String getPrerequisites();
    
    public abstract void setPrerequisites();
    
    
    
}
