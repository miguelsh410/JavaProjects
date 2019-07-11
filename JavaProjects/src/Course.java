public class Course implements Comparable<Course>
{
    protected final String department;
    protected final int number;
    private final double creditHours;

    public Course(String department, int number, double creditHours)
    {
        this.department = department;
        this.number = number;
        this.creditHours = creditHours;
    }

    public boolean matchesDepartment(String department)
    {
        return this.department.equals(department);
    }

    public boolean levelIsGreaterThan(int levelToCompare)
    {
        return this.number >= levelToCompare;
    }

    public EOPCourse createEOPCourse(String location)
    {
        return new EOPCourse(this.department,this.number, this.creditHours, location);
    }

    public boolean equals(Object object)
    {
        if (object == null) return false;
        if (!(object instanceof Course)) return false;


        final Course course = (Course) object;
        return ((this.department).equals(course.department)) &&
                ((this.number) == (course.number)) &&
                (this.creditHours == course.creditHours);
    }

    public int compareTo(Course course)
    {
        if(this.getClass() != course.getClass()) return -1;
        else if(this.department.compareTo(course.department) == 0)
        {
        // Compare by course name and if they are the same, compare by course number
            if(this.number > course.number) return 1;
            else return -1;
        }
        else return this.department.compareTo(course.department);
    }

    public String toString()
    {
        return department + "-" + number + " Credit hours: " + creditHours;
    }
}
