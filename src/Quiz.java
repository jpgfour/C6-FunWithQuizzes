import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private String name;
    private boolean isCheckBox;
    private boolean isMultipleChoice;
    private boolean isTrueFalse;
    private ArrayList<Question> listOfQuestions;
    private Scanner input = new Scanner(System.in);
    private String userAnswer;
    private int rawScore = 0;
    private boolean scored = false;

    //constructors
    public Quiz(String name) {
        this.name = name;
    }

    public Quiz(String name, String type, ArrayList<Question> listOfQuestions) {
        this.name = name;
        this.listOfQuestions = listOfQuestions;
    }

    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public ArrayList<Question> getListOfQuestions() {
        return listOfQuestions;
    }

    public void setListOfQuestions(ArrayList<Question> aListOfQuestions) {
        this.listOfQuestions = aListOfQuestions;
    }

    public boolean isCheckBox() {
        return isCheckBox;
    }

    public void setCheckBox(boolean aCheckBox) {
        isCheckBox = aCheckBox;
    }

    public boolean isMultipleChoice() {
        return isMultipleChoice;
    }

    public void setMultipleChoice(boolean aMultipleChoice) {
        isMultipleChoice = aMultipleChoice;
    }

    public boolean isTrueFalse() {
        return isTrueFalse;
    }

    public void setTrueFalse(boolean aTrueFalse) {
        isTrueFalse = aTrueFalse;
    }

    //instance methods
    //add a question
    public void addQuestion(Question aQuestion){
        this.listOfQuestions.add(aQuestion);
    }
    //run quiz
    public void runQuiz() {
        for (Question question : listOfQuestions) {
            question.askQuestion();
            question.displayAnswers();
            userAnswer = input.nextLine();
            if (question.checkAnswer(userAnswer)) {
                this.rawScore++;
                System.out.println("You got that one RIGHT!!");
            } else {
                System.out.println("That's so WRONG!");
            }
        }
    }
    //grade quiz
    public void gradeQuiz() {
        //System.out.println(100*this.rawScore/this.listOfQuestions.size());
        System.out.println("Your raw score was " + this.rawScore + " correct answers out of " + this.listOfQuestions.size() +
                " total questions.\nYou scored " + 100*this.rawScore/this.listOfQuestions.size() + "%.");
    }
}
