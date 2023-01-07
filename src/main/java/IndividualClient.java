import storage.SQL;

import java.sql.ResultSet;
import java.sql.SQLException;

public class IndividualClient extends Client {

    private String firstName;
    private String lastName;

    public IndividualClient(long clientID, String firstName, String lastName) {
        super(clientID);

        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public void load() {
        ResultSet resultSet = SQL.select("SELECT * FROM clients WHERE clientID = " + this.getClientID());

        try {
            if (!resultSet.next()) {
                SQL.execute(
                        "INSERT INTO individualClients (clientID, firstName, lastName, reminderForNextCourse, questionnaireCompleted, bandPurchasedThisMonth, timeTillNextBandPurchase, consultationCompleted)" +
                                "VALUES (?, ?, ?)",
                        this.getClientID(), this.getFirstName(), this.getLastName(), this.getReminderForNextCourse(), this.isQuestionnaireCompleted(), this.isBandPurchasedThisMonth(), this.getTimeTillNextBandPurchase(), this.isConsultationCompleted());
            } else {
                while (resultSet.next()) {
                    this.setFirstName(resultSet.getString("firstName"));
                    this.setLastName(resultSet.getString("lastName"));
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
                "UPDATE individualClients SET firstName = ?, lastName = ?, reminderForNextCourse = ?, questionnaireCompleted = ?, bandPurchasedThisMonth = ?, timeTillNextBandPurchase = ?, consultationCompleted = ? WHERE clientID = ?",
                this.getFirstName(), this.getLastName(), this.getReminderForNextCourse(), this.isQuestionnaireCompleted(), this.isBandPurchasedThisMonth(), this.getTimeTillNextBandPurchase(), this.isConsultationCompleted(), this.getClientID());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
