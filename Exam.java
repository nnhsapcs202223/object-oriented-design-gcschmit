import java.util.ArrayList;
import java.util.Scanner;

/**
 * An exam *has a* list of questions.
 *
 * @author gcschmit
 * @version 02feb2023
 */
public class Exam
{
    /*
     * An exam object *has a* list of questions; an exam *is not* a question
     */
    private ArrayList<Question> questions;

    public Exam()
    {
        this.questions = new ArrayList<Question>();
    }

    public void addQuestion(Question q)
    {
        this.questions.add(q);
    }

    public void askQuestion()
    {
        Scanner in = new Scanner(System.in);

        for(Question q : questions)
        {
            System.out.println(q);

            System.out.print("Your answer: ");
            String response = in.nextLine();

            System.out.println(q.checkAnswer(response));
        }
    }
}
