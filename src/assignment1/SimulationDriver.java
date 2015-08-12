package assignment1;

import java.util.ArrayList;
import java.util.Random;

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		
		/* 1) create a question type and configure the answers */
		String question = "How many licks does it take to get to the center of a tootsie pop? ";
		ArrayList<String> answerBanks = new ArrayList<String>();
		answerBanks.add("A. 10");
		answerBanks.add("B. 20");
		answerBanks.add("C. 30");
		answerBanks.add("D. 40");
		answerBanks.add("E. 50");
		
		Question mQuestion = new MultipleChoiceQuestion(question, answerBanks);
		
//		String question = "Yes or No";
//		ArrayList<String> answerBanks = new ArrayList<String>();
//		answerBanks.add("Yes");
//		answerBanks.add("No");
//		
//		Question sQuestion = new SingleChoiceQuestion(question, answerBanks);
		
		/* 2) Configure the question for iVote Service */
		IVoteService iVote = new IVoteService();
		
		/* 3) Randomly generate a number students and the answers */
		int randomSize = (int)(new Random().nextInt(60) + 1);
		Student student[] = new Student[randomSize];
		System.out.println(randomSize);
		
		/* 4) Submit all the students' answers to iVote Service */
		int randomStudents = (int)(new Random().nextInt(randomSize));
		int randomNumber;
		
		for (int i = 0; i < student.length; ++i)
		{
			student[i] = new Student("" + i);
			
		}
			
		for (int i = 0; i < randomStudents; ++i)
		{
			randomNumber = (int)(new Random().nextInt(randomStudents));
			student[randomNumber].submitAnswer(mQuestion);
//			student[i].submitAnswer(sQuestion);
			System.out.println("Student: " + student[randomNumber].getId() + "\t|\t Answer: " + student[randomNumber].getAnswer());
		}
		
		/* 5) Call the iVote Service output function to display the result */
		iVote.printCounter();
		
	}
}