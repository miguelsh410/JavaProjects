import java.util.List;

public class ComputerScienceMajor implements Major
{
    private static String cmscMajorString;

    public ComputerScienceMajor(String cmscMajorString)
    {
        ComputerScienceMajor.cmscMajorString = cmscMajorString;
    }

    public boolean qualifiesForMajor(List<Course> courses)
    {
        int countQualifyingCourses = 0;
        int countCoursesAboveRequiredLevel = 0;
        final int requiredCoursesInMajor = 3;
        final int aboveRequiredLevelNeeded = 1;

        for(Course individualCourse: courses)
        {
            if(individualCourse.matchesDepartment(ComputerScienceMajor.cmscMajorString))
            {
                countQualifyingCourses++;

                if (individualCourse.levelIsGreaterThan(300)) countCoursesAboveRequiredLevel++;
            }
        }

        return countQualifyingCourses >= requiredCoursesInMajor && countCoursesAboveRequiredLevel >= aboveRequiredLevelNeeded;
    }

    public String toString()
    {
        return "Computer Science";
    }
}
