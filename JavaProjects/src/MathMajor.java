import java.util.List;

public class MathMajor implements Major
{
    private static String mathMajorString;

    public MathMajor(String mathMajorString)
    {
        MathMajor.mathMajorString = mathMajorString;
    }

    public boolean qualifiesForMajor(List<Course> courses)
    {
        int countQualifyingCourses = 0;
        final int requiredCoursesInMajor = 3;

        for(Course individualCourse: courses)
        {
            if(individualCourse.matchesDepartment(MathMajor.mathMajorString) && individualCourse.levelIsGreaterThan(200))
            {
                countQualifyingCourses++;
            }
        }

        return countQualifyingCourses >= requiredCoursesInMajor;
    }

    public String toString()
    {
        return "Mathematics";
    }
}
