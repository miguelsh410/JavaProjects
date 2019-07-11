import java.util.*;

public class Student
{
    private final String name;
    private final int idNumber;
    private final List<Course> courses;
    private static int setIdNumerically = 0;
    private final Major major;
    public boolean coursesNeedToBeSorted;

    public Student(String name, Major major)
    {
        Student.setIdNumerically++;
        this.idNumber = setIdNumerically;
        this.name = name;
        this.courses = new ArrayList<>();
        this.major = major;
        this.coursesNeedToBeSorted = false;
    }

    public boolean precedesById(Student student)
    {
        return (student.idNumber > this.idNumber);
    }

    public void addCourse(Course course)
    {
        final int maximumCourseNumber = 10;

        if (!this.courses.contains(course) && this.courses.size() < maximumCourseNumber)
        {
            this.coursesNeedToBeSorted = true;
            this.courses.add(course);
        }
        else System.out.println("The following course was previously added, or you are exceeding the maximum " +
                "number of courses allowed: " + course);
    }

    public void dropCourse(Course course)
    {
        if(this.courses.contains(course))
        {
            this.courses.remove(course);
        }
        else System.out.println("You cannot delete a course you are not in.");
    }

    public String toString()
    {
        String courseName = "\nNo courses.\n" ;

        if(this.courses.size() > 0)
        {
            if(this.coursesNeedToBeSorted)
            {
                Collections.sort(this.courses);
                this.coursesNeedToBeSorted = false;
            }

            courseName = "\nCurrently enrolled in: \n";

            for (Course course: this.courses)
            {
                courseName += course.toString() + "\n";
            }
        }

        return "Student name: " + this.name + "; ID: " + this.idNumber + "\nMajor: " + this.major +
                "\nQualifies for major: " +  this.major.qualifiesForMajor(this.courses) + courseName;
    }
}
