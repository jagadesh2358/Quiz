package quiz;

import java.util.List;


public class Quiz
{
	private List<Question> questions;
	private int score;
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
//	public Quiz(List<Question> questions, int score) {
//		super();
//		this.questions = questions;
//		this.score = score;
//	}
	
	
}
