package assignment1;

import java.util.ArrayList;
import java.util.Random;

/**
 * The simulation driver will basically run the main program to perform
 * the iVote simulator.
 * @author Charles Chuong
 */

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		/*================== 1) create a question type and configure the answers ================== */
		
		//Multiple Choice Question
		String question = "How many licks does it take to get to the center of a tootsie pop? ";
		ArrayList<String> answerBanks = new ArrayList<String>();
		answerBanks.add("A. 10");
		answerBanks.add("B. 20");
		answerBanks.add("C. 30");
		answerBanks.add("D. 40");
		answerBanks.add("E. 50");
		Question mQuestion = new MultipleChoiceQuestion(question, answerBanks);
		
		//Single Choice Question
		String question2 = "Are you cool? ";
		ArrayList<String> answerBanks2 = new ArrayList<String>();
		answerBanks2.add("Yes");
		answerBanks2.add("No");
		Question sQuestion = new SingleChoiceQuestion(question2, answerBanks2);
		
		Question type[] = new Question[2];
		Question questionPick;
		type[0] = mQuestion; 
		type[1] = sQuestion;
		questionPick = type[(int)(new Random().nextInt(2))];
		
		System.out.println(questionPick.getQuestion());
		
		/* ================== 2) Configure the question for iVote Service ==================*/
		IVoteService iVote = new IVoteService();
		
		/* ================ 3) Randomly generate a number students and the answers ==================*/
		int randomSize = (int)(new Random().nextInt(60) + 1);
		Student student[] = new Student[randomSize];
		System.out.println("Total student size: " + randomSize);
		
		/* ================ 4) Submit all the students' answers to iVote Service ==================*/
		int randomStudents = (int)(new Random().nextInt(randomSize));
		int randomNumber;
		
		System.out.println("\nStudents Participating: ");
		
		for (int i = 0; i < student.length; ++i)
		{
			student[i] = new Student("ID#" + i);
		}
			
		for (int i = 0; i < randomStudents; ++i)
		{
			//Number of students participating from the class
			randomNumber = (int)(new Random().nextInt(randomStudents));
			student[randomNumber].submitAnswer(questionPick);
			System.out.println("Student: " + student[randomNumber].getId() + "\t|\t Answer: " + student[randomNumber].getAnswer());
		}
		
		/*================== 5) Call the iVote Service output function to display the result================== */
		iVote.printCounter();
		
	}
}