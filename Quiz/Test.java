package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test
{

	public static void main(String[] args)
	{
		List<Question> questions=new ArrayList<Question>();
		questions.add(new Question("Which of the following is not a non-metallic mineral?", List.of("Mica","Bauxite","Granite","Silica"), 2));
		questions.add(new Question("Chlorophyll absorbs which of the wavelength of the Sun light ?", List.of("Green & Blue","Green & Red","Red & Blue","Red & Yellow"), 3));
		questions.add(new Question("Skin works as a respiratory organ in which of the following Animals ?", List.of("Cockroach","Frog","Whale","Dog Fish"), 2));
		questions.add(new Question("Hodophobia is a fear associated with which of the following?", List.of("Sleeping","Walking","Traveling","Running"), 3));
		questions.add(new Question("Who was the first scientist to discover Electrons?", List.of("Albert Einstein","Issac Newton","J.C.Bose","J.J Thompson"), 4));
		
		System.out.println("Welcome to Quiz");
		
		Quiz quiz=new Quiz();
		quiz.setQuestions(questions);
		quiz.setScore(0);
		int score=quiz.getScore();
		
		for(Question question:questions)
		{
			displayQuestion(question);
			
			int userOption=getValidUserInput(question.getOptions().size());
			
			if(userOption==question.getCorrectAnswer())
			{
				System.out.println("Correct Answer.....");
				score++;
			}
			else
			{
				System.out.println("Wrong Answer! The correct answer is :"+question.getCorrectAnswer()+": "+question.getOptions().get(question.getCorrectAnswer()-1));
			}
		}
		
		System.out.println("Total Score is : "+score);
				
	}
	
	public static void displayQuestion(Question question)
	{
		System.out.println(question.getText());
		for(int i=0;i<question.getOptions().size();i++)
		{
			System.out.println((i+1)+".  "+question.getOptions().get(i));
		}
	}
	
	public static int getValidUserInput(int maxOption)
	{
		Scanner scanner=new Scanner(System.in);
		int userOption;
		while(true)
		{
			System.out.println("Select Options in between (1-"+maxOption+"): ");
			if(scanner.hasNextInt())
			{
				userOption=scanner.nextInt();
				if(userOption>=1 && userOption<=maxOption)
				{
					break;
				}
				else
				{
					System.out.println("Please enter valid option");
				}
			}
			else
			{
				System.out.println("Please enter valid integer");
				scanner.next();
			}
		}
		return userOption;
	}
	
	

}
