import java.util.LinkedList;

public class SuggestedCourses<T> extends LinkedList<T> {

        public SuggestedCourses() {
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
