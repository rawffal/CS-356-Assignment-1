package assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class Question {

	private String type;
	
	public Question(String type) 
	{
		this.type = type;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public String choice() {
		
		ArrayList<String> questions = new ArrayList<String>();
		questions.add("How many siblings do you have?\nA. 0\nB. 1\nC. 2\nD. 3\nE. 4");
		questions.add("How many fingers do you have?\nA. 0\nB. 1\nC. 2\nD. 3\nE. 4");
		questions.add("How long is Resonance of Fate?\nA. 10\nB. 20\nC. 30\nD. 40\nE. 50");
		questions.add("How many hours did it take you to complete Persona Q?\nA. 10\nB. 20\nC. 30\nD. 40\nE. 50");
		questions.add("Who does Asha Khakpour look like?\nA. Ben Kingsley\nB. Kim Kardashian\nC. Gandhi\nD. Robert Freeman\nE. Asha Khakpour");
		Collections.shuffle(questions);
		
		ArrayList<String> singleQuestions = new ArrayList<String>();
		singleQuestions.add("I am that guy");
		singleQuestions.add("She is that guy");
		singleQuestions.add("Bobby is not that guy");
		singleQuestions.add("CS 356 is the guy");
		singleQuestions.add("Peanut butter sandwich");
		Collections.shuffle(singleQuestions);
		
		if (this.type == "Single")
		{
			return singleQuestions.get(0);
		}
		return questions.get(0);
		
	}
	
	
	
}
