package assignment1;

public class IVoteService {

	private String type;
	private String answer;
	
	private static int aCounter = 0;
	private static int bCounter = 0;
	private static int cCounter = 0;
	private static int dCounter = 0;
	private static int eCounter = 0;
	private static int zeroCounter = 0;
	private static int oneCounter = 0;
	
	public IVoteService(Student student[]) {
		for (int i = 0; i < student.length; ++i)
		{
			answer = student[i].getAnswer();
			type = student[i].getType();
			countAnswer(answer);
		}
	}
	
	public void printCounter() {
		
		if (type == "Multiple") {
			System.out.println("A: " + aCounter);
			System.out.println("B: " + bCounter);
			System.out.println("C: " + cCounter);
			System.out.println("D: " + dCounter);
			System.out.println("E: " + eCounter);
		}
		else
		{
			System.out.println("0: " + zeroCounter);
			System.out.println("1: " + oneCounter);
		}
	}
	
	public void countAnswer(String a) {
		
			switch (a)
			{
			case "0":
				zeroCounter++;
				break;
			case "1":
				oneCounter++;
				break;
			case "A":
				aCounter++;
				break;
			case "B":
				bCounter++;
				break;
			case "C":
				cCounter++;
				break;
			case "D":
				dCounter++;
				break;
			case "E":
				eCounter++;
				break;
			default:
				System.out.println("Dafuq");
				break;
			}
	}
}
