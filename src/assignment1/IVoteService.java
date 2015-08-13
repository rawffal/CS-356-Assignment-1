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
		
//		for (int i = 0; i < Student.returnCollected().size(); ++i)
		for (String id : Student.returnCollected().keySet())
		{
			if (!(table.containsKey(Student.returnCollected().get(id))))
			{
				table.put(Student.returnCollected().get(id), 1);
			}
			else
			{
				table.put(Student.returnCollected().get(id), table.get(Student.returnCollected().get(id)) + 1);
			}
		}
		System.out.println(table);
	}
}

