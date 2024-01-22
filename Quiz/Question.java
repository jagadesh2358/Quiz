package quiz;

import java.util.List;

public class Question
{
	private String text;
	private List<String> options;
	private int correctAnswer;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public int getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public Question(String text, List<String> options, int correctAnswer) {
		super();
		this.text = text;
		this.options = options;
		this.correctAnswer = correctAnswer;
	}
	
	

}
