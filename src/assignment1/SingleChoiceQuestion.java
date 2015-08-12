package assignment1;

import java.util.ArrayList;

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
		// TODO Auto-generated method stub
		return this.question;
	}
	
	@Override
	public ArrayList<String> getAnswers()
	{
		return this.answerChoices;
	}

	@Override
	public boolean single() {
		// TODO Auto-generated method stub
		return true;
	}
	
}