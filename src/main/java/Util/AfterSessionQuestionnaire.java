package Util;

import java.util.LinkedHashMap;

public class AfterSessionQuestionnaire {

    private LinkedHashMap<String, String> questionsAndAnswers;

    public AfterSessionQuestionnaire() {
        this.questionsAndAnswers = new LinkedHashMap<>();
        generateQuestions();
    }

    public void generateQuestions() {
        this.getQuestionsAndAnswers().put("Did you find the session helped you? (Y/N)", "");
        this.getQuestionsAndAnswers().put("Was the session interesting? (Y/N)", "");
        this.getQuestionsAndAnswers().put("Would you like to see more of these types of sessions? (Y/N)", "");
    }

    public LinkedHashMap<String, String> getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }

    public void setQuestionsAndAnswers(LinkedHashMap<String, String> questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
    }
}
