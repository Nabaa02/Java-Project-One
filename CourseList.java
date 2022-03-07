/**
 * @author Nabaa Khan
 * Class that stores a list of courses
 */
public class CourseList{
  
  /*
   * Stores a list of courses
   */
  private Course[] listOfCourses;
  
  /*
   * Stores the number of elements in the course list 
   */
  private int size;
  
  /*
   * Constructor that instantiates the list of courses
   * @param listOfCourses is the list of courses
   */
  public CourseList(Course[] listOfCourses){
    this.listOfCourses = listOfCourses;
  }
  
  /*
   * Returns current list of courses
   * @return course array that consists of the courses in the list so far
   */
  public Course[] getListOfCourses(){
    return listOfCourses;
  }
  
  /*
   * Returns the size of the course list
   * @return the number of courses in the list
   */
  public int size(){
    return listOfCourses.length;
  }
  
  /*
   * Updates size of course list
   * @param s is the amount the size is changed
   */
  public void updateSize(int s){
    s = size;
  }
  
  /*
   * Adds course before i-th element to list
   * @param i is the index 
   * @param course is the added course
   */
  public void addCourse(int i, Course course){
    //if the index is greater than the size of the list, adds to the end of the list
    //increments size +1
    if(i > size()){
      listOfCourses[size()] = course;
      updateSize(size() + 1);
    }
    else{
      //create new temporary array
      Course[] newArr = new Course[10];
      //copies contents of original array to new array
      for(int index = 0; index < i - 1; index++){
        newArr[index] = getListOfCourses()[index];
      }
      //adds course before i-th element
      newArr[i - 1] = course;
      //adds course after i-th element 
      for(int j = i; j < getListOfCourses().length - 1; j++){
        newArr[j] = getListOfCourses()[j - 1];
      }
      //moves contents from temporary array to original array
      for(int k = 0; k < getListOfCourses().length - 1; k++){
        getListOfCourses()[k] = newArr[k];
      }
      //increments size +1
      updateSize(size() + 1);
    }
  } 
  
  /*
   * Removes course from the course list
   * @param i is the index
   * @return true/false depending on whether the course can be removed
   */
  
  public boolean removeCourse(int i){
    if(i <= size()){
      //shifts contents to the left to "remove" element 
      for(int index = i; index < getListOfCourses().length - 1; index++){
        getListOfCourses()[index] = getListOfCourses()[index + 1];
      }
      //increments size -1
      updateSize(size() - 1);
      return true;
    }
    //if the index is greater than the size of the list, returns false, as the element does not exist
    return false;
  }
  
  /*
   * Changes capacity of course if course is in list
   * @param courseID is the ID of the course
   * @param capacity is the capacity of the course
   * @return true/false depending on whether the course ID is in the list and the capacity can be changed
   */
  public boolean changeCapacity(String courseID, int capacity){
    //checks to see if course is in list
    for(int i = 0; i < size(); i++){
      if(listOfCourses[i].getCourseID().equals(courseID)){
        //changes capacity to specified amount 
        listOfCourses[i].setCapacity(capacity);
        return true;
      }
    }
    //if course is not in list, returns false
    return false;
  }
  
  /*
   * Returns i-th element of the course list
   * @param i is the index
   * @return the i-th element of the course list
   */
  public Course getCourseWithIndex(int i){
    //if the index is greater than the size of the list, returns null
    if(i > size()){
      return null;
    }
    //otherwise, returns the i-th element 
    //NOTE: uses getter method (getCourseID, getCourseName, getCapacity) for testing to verify  
    return listOfCourses[i];
  }
  
  /*
   * Returns the index of the course with this course ID
   * @param courseID is the ID of the course
   * @return the index of the course with this course ID
   */
  public int searchCourseID(String courseID){
    //checks to see if this course ID equals course ID in input
    for(int i = 0; i < size(); i++){
      if(listOfCourses[i].getCourseID().equals(courseID)){
        //returns the index of where the course IDs are equal
        return i;
      }
    }
    //if course IDs are not equal, returns -1
    return -1;
  }
  
  /*
   * Returns the index of the course with this course name
   * @param courseName is the name of the course
   * @return the index of the course with this course name
   */
  public int searchCourseName(String courseName){
    //checks to see if this course name equals course name in input
    for(int i = 0; i < size(); i++){
      if(listOfCourses[i].getCourseName().equals(courseName)){
        //returns the index of where the course names are equal
        return i;
      }
    }
    //if course names are not equal, returns -1
    return -1;
  }                   
}