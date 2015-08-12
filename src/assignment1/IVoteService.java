package assignment1;

import java.util.Map;
import java.util.TreeMap;

public class IVoteService {

	private Map<String, Integer> table = new TreeMap<String, Integer>();
	
	public IVoteService()
	{
		
	}
	
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

