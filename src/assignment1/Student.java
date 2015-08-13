package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Student {

	private String uniqueId;
	private ArrayList<String> answer;
	private static HashMap<String, String> collectAnswer = new HashMap<String, String>();
	
	public Student(String id)
	{
		this.uniqueId = id;
	}
	
	public String getId()
	{
		return uniqueId;
	}
	
	public ArrayList<String> submitAnswer(Question question) 
	{
		//If question object is Single Choice
		if (question.single())
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			answer.remove(0);
			collectAnswer.put(getId(), answer.get(0));
		}
		//If question object is Multiple Choice
		else if(!(question.single()))
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			for (int i = answer.size() - 1; i > (int)(new Random().nextInt(answer.size()) + 1); i--)
			{
				answer.remove(i);
			}
			
			for (int i = 0; i < answer.size(); ++i)
			{
				if (answer.get(i) != null)
				{
					collectAnswer.put(getId(), answer.get(i));
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}
	
	public ArrayList<String> getAnswer() {
		return answer;
	}
	
	public static HashMap<String, String> returnCollected() 
	{
		return collectAnswer;
	}
}