import storage.MySQL;
import storage.SQL;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {
        // create MySQL Connection
        new MySQL();

        // one connection is established, queries can be made
        SQL.createTable("individualClients", "clientID INT NOT NULL PRIMARY KEY, firstName VARCHAR(100) NOT NULL, lastName VARCHAR(100) NOT NULL, reminderForNextCourse LONG NOT NULL, questionnaireCompleted BOOLEAN NOT NULL, bandPurchasedThisMonth BOOLEAN NOT NULL, timeTillNextBandPurchase LONG NOT NULL, consultationCompleted BOOLEAN NOT NULL");
        SQL.createTable("corporateClients", "clientID INT NOT NULL PRIMARY KEY, companyName VARCHAR(100) NOT NULL, reminderForNextCourse LONG NOT NULL, questionnaireCompleted BOOLEAN NOT NULL, bandPurchasedThisMonth BOOLEAN NOT NULL, timeTillNextBandPurchase LONG NOT NULL, consultationCompleted BOOLEAN NOT NULL");
        SQL.createTable("consultants", "consultantID INT NOT NULL PRIMARY KEY");
        SQL.createTable("courses", "courseID INT NOT NULL, courseName VARCHAR(100) NOT NULL, courseDescription VARCHAR(100) NOT NULL, coursePrice INT NOT NULL, courseDuration INT NOT NULL");
        SQL.createTable("sessions", "sessionID INT NOT NULL PRIMARY KEY, sessionDate VARCHAR(100) NOT NULL, timeLimit INT NOT NULL, sessionCourse INT NOT NULL, FOREIGN KEY (sessionCourse) REFERENCES courses(courseID))");
    }

}
