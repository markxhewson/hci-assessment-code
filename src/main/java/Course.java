import java.util.LinkedList;

public class Course {

    protected long courseID;
    private String courseName;
    private long coursePrice;
    private Client client;
    private Consultant consultant;
    private boolean specialCourse;
    private LinkedList<Session> courseSessions;

    public Course(long courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public long getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(long coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public void setConsultant(Consultant consultant) {
        this.consultant = consultant;
    }

    public boolean isSpecialCourse() {
        return specialCourse;
    }

    public void setSpecialCourse(boolean specialCourse) {
        this.specialCourse = specialCourse;
    }

    public void addCourseSession(Session session) {
        if (this.getCourseSessions().size() < 36) {
            this.getCourseSessions().add(session);
        }
    }

    public LinkedList<Session> getCourseSessions() {
        return courseSessions;
    }

    public void setCourseSessions(LinkedList<Session> courseSessions) {
        this.courseSessions = courseSessions;
    }
}
