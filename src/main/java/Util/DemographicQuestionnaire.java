package Util;

import java.util.LinkedHashMap;

public class DemographicQuestionnaire {

    private LinkedHashMap<String, String> questionsAndAnswers;

    public DemographicQuestionnaire() {
        this.questionsAndAnswers = new LinkedHashMap<>();
        generateQuestions();
    }

    public void generateQuestions() {
        this.getQuestionsAndAnswers().put("What is your forename?", "");
        this.getQuestionsAndAnswers().put("What is your surname?", "");
        this.getQuestionsAndAnswers().put("What is your age?", "");
        this.getQuestionsAndAnswers().put("What is your ethnicity?", "");
        this.getQuestionsAndAnswers().put("What is your gender?", "");
        this.getQuestionsAndAnswers().put("What is your marital status?", "");
        this.getQuestionsAndAnswers().put("Where did you hear about us?", "");
        this.getQuestionsAndAnswers().put("Do you struggle with depression or anxiety? (Y/N)", "");
        this.getQuestionsAndAnswers().put("How does this impact you on a daily basis?", "");
        this.getQuestionsAndAnswers().put("Do you struggle with stress?", "");
        this.getQuestionsAndAnswers().put("How does this impact you on a daily basis?", "");
        this.getQuestionsAndAnswers().put("Have you attempted suicide in the past year?", "");
        this.getQuestionsAndAnswers().put("Have you had support from other services in the past? (Y/N)", "");
        this.getQuestionsAndAnswers().put("If yes, where and how long for?", "");
    }

    public LinkedHashMap<String, String> getQuestionsAndAnswers() {
        return questionsAndAnswers;
    }

    public void setQuestionsAndAnswers(LinkedHashMap<String, String> questionsAndAnswers) {
        this.questionsAndAnswers = questionsAndAnswers;
    }
}
