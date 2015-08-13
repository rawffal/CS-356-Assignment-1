package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

/**
 * The student class mainly has its own unique identification and it has to
 * be able to submit answers to the IVoteService provider in order to 
 * create statistics. 
 * @author Charles Chuong
 *
 */

public class Student {

	private String uniqueId;
	private ArrayList<String> answer;
	private static HashMap<String, ArrayList<String>> collectAnswer = new HashMap<String, ArrayList<String>>();
	
	public Student(String id)
	{
		this.uniqueId = id;
	}
	
	public String getId()
	{
		return uniqueId;
	}
	
	/* This method will determine whether the answer being submitted is for a single choice
	 * or a multiple choice question. It will store the answers in one array list for the
	 * individual student and another array list for the collection.*/
	public ArrayList<String> submitAnswer(Question question) 
	{
		//If question object is Single Choice
		if (question.single())
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			answer.remove(0);
			collectAnswer.put(getId(), answer);
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
					collectAnswer.put(getId(), answer);
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}
	
	public ArrayList<String> getAnswer() {
		return answer;
	}
	
	public static HashMap<String, ArrayList<String>> returnCollected() 
	{
		return collectAnswer;
	}
}