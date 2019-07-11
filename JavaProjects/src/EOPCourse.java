public class EOPCourse extends Course
{
    private final String location;

    public EOPCourse(String department, int number, double creditHours, String location)
    {
        super(department, number, creditHours);
        this.location = location;
    }

    public int compareTo(Course course)
    {
        if(this.getClass() != course.getClass()) return 1;
        else
        {
            final EOPCourse courseEOP = (EOPCourse)(course);

            if(this.location.compareTo(courseEOP.location) == 0)
            {
                if(super.department.compareTo(courseEOP.department) == 0)
                {
                    if(super.number > courseEOP.number) return 1;
                    else return -1;
                }
                else return super.department.compareTo(courseEOP.department);
            }
            return this.location.compareTo(courseEOP.location);
        }
    }

    public String toString()
    {
        return super.toString() + " This is an EOP course in " + this.location;
    }
}
