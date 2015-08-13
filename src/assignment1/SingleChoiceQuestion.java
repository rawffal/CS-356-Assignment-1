package assignment1;

import java.util.ArrayList;

/**
 * This class implements the Question interface for the main purpose of
 * determining single choice answers.
 * @author Charles Chuong
 *
 */
public class SingleChoiceQuestion implements Question {

	private String question;
	private ArrayList<String> answerChoices;
	
	public SingleChoiceQuestion(String question, ArrayList<String> answerChoices)
	{
		this.question = question;
		this.answerChoices = answerChoices;
	}
	
	@Override
	public String getQuestion() {
		return this.question;
	}
	
	@Override
	public ArrayList<String> getAnswers()
	{
		return this.answerChoices;
	}

	@Override
	public boolean single() {
		return true;
	}
	
}