package extractclass;

public class Person {
	private String _name;
	private String _officeAreaCode;
	private String _officeNumber;

	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return "(" + _officeAreaCode + ")" + _officeNumber;
	}
}
