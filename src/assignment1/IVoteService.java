package assignment1;

import java.util.Hashtable;

public class IVoteService {

	private Hashtable<String, Integer> table = new Hashtable<String, Integer>();
	
	
	public void printCounter() 
	{
		
		for (int i = 0; i < Student.returnCollected().size(); ++i)
		{
			if (!(table.containsKey(Student.returnCollected().get(i))))
			{
				table.put(Student.returnCollected().get(i), 1);
			}
			else
			{
				table.put(Student.returnCollected().get(i), table.get(Student.returnCollected().get(i)) + 1);
				
			}
		}
		
		System.out.println(table);
		
	}

}

