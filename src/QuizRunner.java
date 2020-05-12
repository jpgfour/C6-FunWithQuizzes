import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class QuizRunner {

    public static void main(String args[]) {

        String quizRules = "For this quiz, please enter the numbers of all correct answers as consecutive characters.\n  " +
                "For example, if the question is \n" +
                "\n" +
                "Who was the first president of the United States?\n" +
                "1. George Washington\n" +
                "2. Abraham Lincoln\n" +
                "3. David Ortiz\n" +
                "\n" +
                "...your correct response would be '1'.  If the question was instead\n" +
                "\n" +
                "Who previously was President of the United States?\n " +
                "1. George Washington\n" +
                "2. Abraham Lincoln\n" +
                "3. David Ortiz\n" +
                "\n" +
                "...your correct response would be '12'." +
                "\n" +
                "*****" +
                "\n" +
                "\n";

        //testing setup
        //test hashmap of answer strings and correctness booleans
        HashMap<String, Boolean> testHM = new HashMap<String,Boolean>();
        testHM.put("Jeremy", true);
        testHM.put("Paul",true);
        testHM.put("Grise",true);
        testHM.put("Hernandez",false);
        //setup new MultipleChoice question
        MultipleChoice testQuestionOne = new MultipleChoice("What's my name?", testHM);
        //setup Array of Questions
        ArrayList<Question> testListOne = new ArrayList<>();
        //sneakily add a MultipleChoice into a Question ArrayList
        testListOne.add(testQuestionOne);
        //create a quiz
        Quiz testQuizOne = new Quiz("test quiz 1!!!","type = remove this",testListOne);

        //debugging answering
//        testQOne.askQuestion();
//        testQOne.displayAnswers();
//        System.out.println(testQOne.checkAnswer("123"));

        //for reals answering
        System.out.println(quizRules);
        testQuizOne.runQuiz();
        testQuizOne.gradeQuiz();
    }

}
