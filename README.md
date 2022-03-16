# Java-Project-One
In this program, we are instructed to create two classes: Course and CourseList. The Course class stores information of a course, while CourseList stores a list of courses.

# Course Class - Fields
- courseID: a string, the ID of the course
- courseName: a string, the name of the course
- capacity: an integer, the initial capacity limit of the course

# CourseList Class - Fields
- listOfCourses: an array of Course objects

# CourseList Class - Methods
- int size(): returns the current size of the list, which is the number of the courses in the list 
- void addCourse(int i, Course course): adds a new Course object before the i-th element 
of the list (the index of the first element is 0). If i is greater than the list size, adds it to the 
end
- boolean removeCourse(int i): deletes the i-th element of the list and returns true. If the 
list has less than i elements, returns false 
- boolean changeCapacity(String courseID, int capacity): changes the capacity of the 
course with this courseID if this course is in the list and then returns true (which means it 
is a successful operation). Otherwise, returns false and does nothing instead 
- Course getCourseWithIndex(int i): returns the i-th element of the list. If the list has less 
than i elements, returns null
- int SearchCourseID(String courseID): returns the index of the course with this courseID 
in the list. If the course is not in the list, returns -1 instead 
- int SearchCourseName(String courseName): returns the index of the course with this 
courseName in the list. If the course is not in the list, returns -1 instead
