import Util.TimeUtil;

import java.util.ArrayList;
import java.util.LinkedList;

public class Client {

    protected long clientID;
    protected long reminderForNextCourse;
    protected boolean questionnaireCompleted;
    protected boolean bandPurchasedThisMonth;
    protected long timeTillNextBandPurchase;
    protected boolean consultationCompleted;
    protected LinkedList<Course> coursesPurchased;
    protected LinkedList<Course> suggestedCourses;

    public Client(long clientID) {
        this.clientID = clientID;
    }

    public void sendQuestionnaire() {
        // TODO: send questionnaire to user to complete
        this.setQuestionnaireCompleted(true);
    }

    public void sendCourseReminder() {
        System.out.println("Your next course is in " + TimeUtil.format(reminderForNextCourse));
    }

    public long getReminderForNextCourse() {
        return reminderForNextCourse;
    }

    public void setReminderForNextCourse(long reminderForNextCourse) {
        this.reminderForNextCourse = reminderForNextCourse;
    }

    public boolean isQuestionnaireCompleted() {
        return questionnaireCompleted;
    }

    public void setQuestionnaireCompleted(boolean questionnaireCompleted) {
        this.questionnaireCompleted = questionnaireCompleted;
    }

    public boolean isBandPurchasedThisMonth() {
        return bandPurchasedThisMonth;
    }

    public void setBandPurchasedThisMonth(boolean bandPurchasedThisMonth) {
        this.bandPurchasedThisMonth = bandPurchasedThisMonth;
    }

    public long getTimeTillNextBandPurchase() {
        return timeTillNextBandPurchase;
    }

    public void setTimeTillNextBandPurchase(long timeTillNextBandPurchase) {
        this.timeTillNextBandPurchase = timeTillNextBandPurchase;
    }

    public boolean isConsultationCompleted() {
        return consultationCompleted;
    }

    public void setConsultationCompleted(boolean consultationCompleted) {
        this.consultationCompleted = consultationCompleted;
    }

    public LinkedList<Course> getCoursesPurchased() {
        return coursesPurchased;
    }

    public void setCoursesPurchased(LinkedList<Course> coursesPurchased) {
        this.coursesPurchased = coursesPurchased;
    }

    public LinkedList<Course> getSuggestedCourses() {
        return suggestedCourses;
    }

    public void setSuggestedCourses(LinkedList<Course> suggestedCourses) {
        this.suggestedCourses = suggestedCourses;
    }
}
