import storage.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class CorporateClient extends Client {

    private int corporateID;
    private String corporateName;
    private int maxPerCourse;
    private CoursesList<Course> courses;
    private LinkedList<IndividualClient> employees;

    public CorporateClient(long clientID, String corporateName, int maxPerCourse) {
        super(clientID);

        this.setCorporateName(corporateName);
        this.setMaxPerCourse(maxPerCourse);
    }

    public void load() {
        ResultSet resultSet = SQL.select("SELECT * FROM corporateClients WHERE corporateID = " + this.getClientID());

        try {
            if (!resultSet.next()) {
                SQL.execute(
                        "INSERT INTO corporateClients (corporateID, corporateName, maxPerCourse, reminderForNextCourse, questionnaireCompleted, bandPurchasedThisMonth, timeTillNextBandPurchase, consultationCompleted)" +
                                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
                        this.getClientID(), this.getCorporateName(), this.getMaxPerCourse(), this.getReminderForNextCourse(), this.isQuestionnaireCompleted(), this.isBandPurchasedThisMonth(), this.getTimeTillNextBandPurchase(), this.isConsultationCompleted());
            } else {
                while (resultSet.next()) {
                    this.setCorporateName(resultSet.getString("corporateName"));
                    this.setMaxPerCourse(resultSet.getInt("maxPerCourse"));
                    this.setReminderForNextCourse(resultSet.getLong("reminderForNextCourse"));
                    this.setQuestionnaireCompleted(resultSet.getBoolean("questionnaireCompleted"));
                    this.setBandPurchasedThisMonth(resultSet.getBoolean("bandPurchasedThisMonth"));
                    this.setTimeTillNextBandPurchase(resultSet.getLong("timeTillNextBandPurchase"));
                    this.setConsultationCompleted(resultSet.getBoolean("consultationCompleted"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        SQL.execute(
                "UPDATE corporateClients SET corporateName = ?, maxPerCourse = ?, reminderForNextCourse = ?, questionnaireCompleted = ?, bandPurchasedThisMonth = ?, timeTillNextBandPurchase = ?, consultationCompleted = ? WHERE corporateID = ?",
                this.getCorporateName(), this.getMaxPerCourse(), this.getReminderForNextCourse(), this.isQuestionnaireCompleted(), this.isBandPurchasedThisMonth(), this.getTimeTillNextBandPurchase(), this.isConsultationCompleted(), this.getClientID());
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

    public void addCourse(Course course) {
        this.getCourses().add(course);
    }

    public int getCorporateID() {
        return corporateID;
    }

    public void setCorporateID(int corporateID) {
        this.corporateID = corporateID;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public int getMaxPerCourse() {
        return maxPerCourse;
    }

    public void setMaxPerCourse(int maxPerCourse) {
        this.maxPerCourse = maxPerCourse;
    }

    public void setEmployees(LinkedList<IndividualClient> employees) {
        this.employees = employees;
    }
}
