package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < 5; ++i)
		{
			index.add(i);
		}
		
		Collections.shuffle(index);
		
		/* Question stuff */
		String questionType[] = {"Multiple", "Single"};
		Question question = new Question(questionType[(int)(new Random().nextInt(2))]);
		System.out.println(question.choice());
		System.out.println();
		
		/* Student stuff */
		String name[] = {"Jon", "Charles", "Kent", "Bobby", "Philip"};
		Student students[] = new Student[(int)(new Random().nextInt(5) + 1)];
		
		for (int i = 0; i < students.length; ++i)
		{
			students[i] = new Student(name[index.get(i)], question.getType());
			System.out.println("\nStudent: " + students[i].getId() + "\nAnswer: " + students[i].getAnswer());
		}
		System.out.println();
		
		IVoteService ivote = new IVoteService(students);
		System.out.println();
		ivote.printCounter();
	}
}
