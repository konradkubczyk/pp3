public class SMS extends Message {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public SMS(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
    }

    public SMS(String text, String phoneNumber) {
        super(text);
        this.setPhoneNumber(phoneNumber);
    }

    public void send() {
        System.out.println(
            "Message: SMS" +
            "\n- content: " + (this.charNumber() > 0 ? this.getText() : "<empty message>") +
            "\n- length: " + this.charNumber() +
            "\n- phone number: " + this.getPhoneNumber()
        );
    }
}
