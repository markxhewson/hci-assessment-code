import java.util.ArrayList;
import java.util.LinkedList;

public class CorporateClient extends Client {

    protected String corporateName;
    protected int maxPerCourse;
    private LinkedList<Course> courses;
    protected LinkedList<IndividualClient> employees;

    public CorporateClient(long clientID, String corporateName, int maxPerCourse) {
        super(clientID);

        this.corporateName = corporateName;
        this.maxPerCourse = maxPerCourse;
    }

    public void addEmployee(IndividualClient individualClient) {
        if (this.getEmployees().size() < 20) {
            this.getEmployees().add(individualClient);
        }
    }

    public LinkedList<IndividualClient> getEmployees() {
        return this.employees;
    }

    public LinkedList<Course> getCourses() {
        return courses;
    }

    public void setCourses(LinkedList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.getCourses().add(course);
    }
}
