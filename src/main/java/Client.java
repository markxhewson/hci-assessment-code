import Util.DemographicQuestionnaire;
import Util.TimeUtil;

import java.util.LinkedList;
import java.util.Scanner;

public class Client {

    private long clientID;
    protected long reminderForNextCourse;
    protected boolean questionnaireCompleted;
    private DemographicQuestionnaire questionnaire;
    protected boolean bandPurchasedThisMonth;
    protected long timeTillNextBandPurchase;
    protected boolean consultationCompleted;
    protected PurchasedCoursesList<Course> coursesPurchased;
    protected SuggestedCourses<Course> suggestedCourses;

    public Client(long clientID) {
        this.setClientID(clientID);
    }

    public void sendQuestionnaire() {
        DemographicQuestionnaire questionnaire = new DemographicQuestionnaire();

        questionnaire.getQuestionsAndAnswers().forEach((question, answer) -> {
            System.out.println("Question: " + question);

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();

            questionnaire.getQuestionsAndAnswers().put(question, input);
        });

        System.out.println("You completed the questionnaire!");
        questionnaire.getQuestionsAndAnswers().forEach((question, answer) -> {
            System.out.println("Question: " + question);
            System.out.println("Answer: " + answer + "\n");
        });

        this.setQuestionnaireCompleted(true);
        this.setQuestionnaire(questionnaire);
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

    public LinkedList<Course> getSuggestedCourses() {
        return suggestedCourses;
    }

    public DemographicQuestionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(DemographicQuestionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }

    public long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }
}
