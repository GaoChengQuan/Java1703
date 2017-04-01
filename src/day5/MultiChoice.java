package day5;

public class MultiChoice extends Question {
	private String[] options;
	private String[] answerIds;

	public MultiChoice() {
		super();
	}

	public MultiChoice(String text) {
		super(text);
	}

	public MultiChoice(String text, String[] options, String[] answerIds) {
		super(text);
		this.options = options;
		this.answerIds = answerIds;
	}
}
