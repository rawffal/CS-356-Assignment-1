package assignment1;

import java.util.ArrayList;

/**
 * This interface contains 3 different methods that will be used for
 * the classes that will implement this interface. The two getter methods
 * are mainly designed to retrieve the String or ArrayList. 
 * @author Charles Chuong
 *
 */
public interface Question {

	public String getQuestion();

	public ArrayList<String> getAnswers();
	
	/* This method will determine whether or not the question is 
	 * a single or multiple choice type question. It will return true or
	 * false depending on the type. */
	public boolean single();
	
	
}