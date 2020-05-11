import java.util.ArrayList;
import java.util.HashMap;

public abstract class Question {
    //fields
    private String prompt;
    private HashMap<String, Boolean>[] answers;
    //constructor
    public Question(String prompt, HashMap<String, Boolean>[] answers) {
        this.prompt = prompt;
        this.answers = answers;
    }
    //getters & setters
    public String getPrompt() {
        return prompt;
    }
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
    public HashMap<String, Boolean>[] getAnswers() {
        return answers;
    }
    public void setAnswers(HashMap<String, Boolean>[] answers) {
        this.answers = answers;
    }
    //instance methods

}
