package day10;

public enum EnumGender {
	// public static final
	//FEMAIL, MAIL
	
	// The constructor EnumGender(String) is undefined
	FEMAIL("女"), MAIL("男");
	
	private String value;
	
	// Illegal modifier for the enum constructor; 
	// only private is permitted.
	private EnumGender(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
