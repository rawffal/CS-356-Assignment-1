package assignment1;

import java.util.Random;

public class Student {

	private String uniqueId;
	private String answer;
	private String type;
	
	public Student(String id, String type)
	{
		this.uniqueId = id;
		this.type = type;
		computeAnswer();
	}
	
	public String getId()
	{
		return uniqueId;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String computeAnswer() {
		//Multiple
		String[] choices = {"A", "B", "C", "D", "E"};
		
		//Single
		String[] choices2 = {"0", "1"};
		
		if (type == "Single")
		{
			answer = choices2[(int)(new Random().nextInt(2))]; 
		}
		else
		{
			answer = choices[(int)(new Random().nextInt(5))];
		}
		return answer;
	}
	
	public String getAnswer() {
		return answer;
	}
}
