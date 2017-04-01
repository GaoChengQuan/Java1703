package day5;

public class SingleChoice extends Question{
	private String[] options;
	private String answerId;

	public SingleChoice() {
		super();
	}

	public SingleChoice(String text, String[] options, String answerId) {
		super(text);
		this.options = options;
		this.answerId = answerId;
	}

	public String[] getOptions() {
		return options;
	}

	public void setOptions(String[] options) {
		this.options = options;
	}

	public String getAnswerId() {
		return answerId;
	}

	public void setAnswerId(String answerId) {
		this.answerId = answerId;
	}

}
