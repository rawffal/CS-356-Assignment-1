package assignment1;

import java.util.Map;
import java.util.TreeMap;

/**
 * This class will take in the submitted answers from the Student
 * and will create results based on the answers.
 * @author Charles Chuong
 *
 */

public class IVoteService {

	private Map<String, Integer> table = new TreeMap<String, Integer>();
	
	/* This method will take in the students' unique Id and traverse through the answers
	 * to check if it submitted their answer more than once. If that student did it more
	 * than once, they will update with the latest submission */
	public void printCounter() 
	{
		for (String id : Student.returnCollected().keySet())
		{
			for (int i = 0; i < Student.returnCollected().get(id).size(); ++i)
			{
				if (!(table.containsKey(Student.returnCollected().get(id).get(i))))
				{
					table.put(Student.returnCollected().get(id).get(i), 1);
				}
				else
				{
					table.put(Student.returnCollected().get(id).get(i), table.get(Student.returnCollected().get(id).get(i)) + 1);
				}
			}
		}
		System.out.println(table);
	}
}

