import java.util.List;

public interface Major
{
    boolean qualifiesForMajor(List<Course> courses);

    String toString();
}
