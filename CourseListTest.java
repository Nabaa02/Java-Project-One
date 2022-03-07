import junit.framework.TestCase;

/**
 * @author Nabaa Khan
 * Test class for methods in Course and CourseList
 */
public class CourseListTest extends TestCase{
  
  /*
   * Tests the setCourseID method of the Course class
   */
  public void testSetCourseID(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    c.setCourseID("ARAB 201");
    String expected = "ARAB 201";
    String actual = c.getCourseID();
    assertEquals("Sets course ID to ARAB 201", expected, actual);
  }
  
  /*
   * Tests the setCourseName method of the Course class
   */
  public void testSetCourseName(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    c.setCourseName("Arabic");
    String expected = "Arabic";
    String actual = c.getCourseName();
    assertEquals("Sets course name to Arabic", expected, actual);
  }
  
  /*
   * Tests the setCapacity method of the Course class
   */
  public void testSetCapacity(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    c.setCapacity(30);
    int expected = 30;
    int actual = c.getCapacity();
    assertEquals("Sets capacity to 30", expected, actual);
  }
  
  /*
   * Tests the getCourseID method of the Course class
   */
  public void testGetCourseID(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    String expected = "CSDS 233";
    String actual = c.getCourseID();
    assertEquals("Returns course ID of the course", expected, actual);
  }
  
  /*
   * Tests the getCourseName method of the Course class
   */
  public void testGetCourseName(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    String expected = "Data Structures";
    String actual = c.getCourseName();
    assertEquals("Returns course name of the course", expected, actual);
  }
  
  /*
   * Tests the getCapacity method of the Course class 
   */
  public void testGetCapacity(){
    Course c = new Course("CSDS 233", "Data Structures", 10);
    int expected = 10;
    int actual = c.getCapacity();
    assertEquals("Returns course capacity of the course", expected, actual);
  }
  
  /*
   * Tests the size method of the CourseList class
   */
  public void testSize(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)}); 
    int expected = 2;
    int actual = cl.size();
    assertEquals("Retrieving number of elements in listOfCourses", expected, actual);
  }
  
  /*
   * Tests the addCourse method of the CourseList class
   */
  public void testAddCourse(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)});
    String expected = "POSC 172";
    cl.addCourse(1, new Course("POSC 172", "Political Science", 25));
    String actual = cl.getCourseWithIndex(0).getCourseID();
    assertEquals("Adds POSC 172 to the course list at the 0th index", expected, actual);
  }
  
  /*
   * Tests the removeCourse method of the CourseList class
   */
  public void testRemoveCourse(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)});
    boolean expected = true; 
    boolean actual = cl.removeCourse(0);
    assertTrue("Removes course at 0th index from list", (actual == expected));
  }
  
  /*
   * Tests the changeCapacity method of the CourseList class
   */
  public void testChangeCapacity(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10)});
    boolean expected = true;
    boolean actual = cl.changeCapacity("CSDS 233", 15);
    assertTrue("Determines whether capacity has been changed", (actual == expected));
  }
 
  /*
   * Tests the getCourseWithIndex method of the CourseList class
   */
  public void testGetCourseWithIndex(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)});
    String expected = "Data Structures";
    String actual = cl.getCourseWithIndex(0).getCourseName();
    assertEquals("Retrieving i-th element of list", expected, actual);
  }
  
  /*
   * Tests the searchCourseID method of the CourseList class
   */
  public void testSearchCourseID(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)});
    int expected = 1;
    int actual = cl.searchCourseID("HSTY 107");
    assertEquals("Returns index of course with HSTY 107 course ID", expected, actual);
  }
  
  /*
   * Tests the searchCourseName method of the CourseList class
   */
  public void testSearchCourseName(){
    CourseList cl = new CourseList(new Course[] {new Course("CSDS 233", "Data Structures", 10), new Course("HSTY 107", "History", 15)});
    int expected = 0;
    int actual = cl.searchCourseName("Data Structures");
    assertEquals("Returns index of course with Data Structures course name", expected, actual);
  }
}