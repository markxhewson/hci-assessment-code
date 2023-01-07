import java.util.LinkedList;

public class CoursesList<T> extends LinkedList<T> {

    public CoursesList() {
        super();
    }

    public void addCourse(T course) {
        this.add(course);
    }

    public LinkedList<T> getCourses() {
        return this;
    }

    public void setCourses(LinkedList<T> courses) {
        this.addAll(courses);
    }

    public void removeCourse(T course) {
        this.remove(course);
    }
}
