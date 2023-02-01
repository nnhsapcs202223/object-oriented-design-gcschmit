
import java.util.Scanner;

/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by
 *      '_'. For example, "The inventor of Java is _James Gosling_." The question should
 *      be displayed as: "The inventor of Java is ___________."
 *
 * @author gcschmit
 * @version 01feb2023
 */

/*
 * The FillinQuestion class extends (i.e., is a subclass of, is derived from) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare the instance variables text and answer!
     * 
     *  The text and answer instance variables are inherited from the Question class!
     */

    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     * 
     * @param question the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explicitly call the Question class's constructor that takes a single parameter.
         *      Calling a superclass's constructor *must* be the first line of code in
         *      the subclass's constructor.
         *      
         *  If we don't explicitly call a superclass's constructor, Java will automatically
         *      call the superclass's default (i.e., no parameters) constructor if it can.
         */
        super(question);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
