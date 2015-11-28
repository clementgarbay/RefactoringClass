package extractclass;

public class PersonRefactored {
	private final PhoneNumber phoneNumber = new PhoneNumber();
	private String _name;

	public String getName() {
		return _name;
	}
	
	public String getTelephoneNumber() {
		return "(" + phoneNumber._officeAreaCode + ")" + phoneNumber._officeNumber;
	}

	public static class PhoneNumber {
		private String _officeAreaCode;
		private String _officeNumber;

		public PhoneNumber() {
		}
	}
}
