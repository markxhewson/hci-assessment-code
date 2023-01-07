import Util.AfterSessionQuestionnaire;
import Util.DemographicQuestionnaire;

import java.util.LinkedList;
import java.util.Scanner;

public class Session {

    protected long sessionID;
    private long timeLimit;
    private AlternativeSessionsList<Session> alternativeSessions;
    private boolean clientHasHeadband;
    private String summaryBrief;
    private AfterSessionQuestionnaire questionnaire;

    public Session(long sessionID) {
        this.sessionID = sessionID;
    }

    public long getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(long timeLimit) {
        this.timeLimit = timeLimit;
    }

    public LinkedList<Session> getAlternativeSessions() {
        return alternativeSessions;
    }

    public boolean isClientHasHeadband() {
        return clientHasHeadband;
    }

    public void setClientHasHeadband(boolean clientHasHeadband) {
        this.clientHasHeadband = clientHasHeadband;
    }

    public String getSummaryBrief() {
        return summaryBrief;
    }

    public void sendEndQuestionnaire() {
        AfterSessionQuestionnaire questionnaire = new AfterSessionQuestionnaire();

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

        this.setQuestionnaire(questionnaire);
    }

    public AfterSessionQuestionnaire getQuestionnaire() {
        return questionnaire;
    }

    public void setQuestionnaire(AfterSessionQuestionnaire questionnaire) {
        this.questionnaire = questionnaire;
    }
}
