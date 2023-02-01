import java.util.Scanner;

/**
 * A FillInQuestion is contructed with a string that contains the answer surrounded by
 *      '_'. For example, "The inventor of Java is _James Gosling_." The question should
 *      be displayed as: "The inventor of Java is _____________."
 *
 * @author gcschmit
 * @version 1 February 2023
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of, is derived from) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare the instance variables text and answer! The text and answer
     *      instance variables are inherited from the Question class!
     */

    /**
     * Constructors a FillInQuestion object with the specified text that contains the
     *      answer.
     *      
     *  @param question the specified question text with embedded answer
     */
    public FillInQuestion(String question)
    {
        /*
         * Explicitly call the Question class's constructor that takes a single parameter.
         *      Calling a superclass's constructor *must* be the first line of code in
         *      the subclass's constructor.
         *      
         *  If we don't explicitly call a superclass's constructor, Java will automatically
         *      call the superclass's default (i.e., no parameters) constructor if possible.
         */
        super(question);
    }

    /**
     * This method overrides the setText method in the Question class.
     * 
     *  Sets the question text and answer.
     *
     * @param  questionText the text of the question, including the answer
     */
    
    /*
     * Use @Override annotation when overriding a method to help the compiler verify
     *      that you are in fact overriding and not overloading by mistake.x
     */
    @Override
    public void setText(String questionText)
    {
        
    }
}
