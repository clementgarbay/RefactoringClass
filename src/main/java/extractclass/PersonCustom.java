package extractclass;

public class PersonCustom {

    private String _name;
    private TelephoneNumber ref = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + ref.getOfficeAreaCode() + ")" + ref.getOfficeNumber();
    }

    private class TelephoneNumber {
        private String _officeAreaCode;

        String getOfficeAreaCode() {
            return _officeAreaCode;
        }

        private String _officeNumber;

        String getOfficeNumber() {
            return _officeNumber;
        }
    }
}
