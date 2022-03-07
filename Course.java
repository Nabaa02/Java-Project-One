/**
 * @author Nabaa Khan
 * Class that stores information of a course
 */
public class Course{
  
  /*
   * Stores the ID of the course
   */
  private String courseID; 
  //test
  /*
   * Stores the complete name of the course
   */
  private String courseName; 
  
  /*
   * Stores the initial capacity limit of this course
   */
  private int capacity; 
  
  /*
   * Constructor that instantiates the course
   * @param courseID is the ID of the course
   * @param courseName is the name of the course
   * @param capacity is the capacity of the course
   */
  public Course(String courseID, String courseName, int capacity){
    this.courseID = courseID;
    this.courseName = courseName;
    this.capacity = capacity;
  }
  
  /*
   * Sets the course ID
   * @param courseID is the course ID of the course
   */
  public void setCourseID(String courseID){
    this.courseID = courseID;
  }
  
  /*
   * Returns the course ID 
   * @return courseID is the course ID of the course
   */
  public String getCourseID(){
    return courseID;
  }
  
  /*
   * Sets the course name
   * @param courseName is the name of the course
   */
  public void setCourseName(String courseName){
    this.courseName = courseName;
  }
  
  /*
   * Returns the course name
   * @return courseName is the name of the course
   */
  public String getCourseName(){
    return courseName;
  }
  
  /*
   * Sets the capacity 
   * @param capacity is the capacity of the course
   */
  public void setCapacity(int capacity){
    this.capacity = capacity;
  }
  
  /*
   * Returns the current capacity of the course
   * @return capacity is the capacity of the course
   */
  public int getCapacity(){
    return capacity;
  }
  
  /*
   * Converts Course address to string
   * @return string is the course with its ID, name, and capacity
   */
  @Override
  public String toString(){
    return ("Course ID: " + getCourseID() + "\n" + "Course name: " + getCourseName() + "\n" + "Capacity: " + getCapacity());
  }
}