public class SMS extends Message {
    public SMS(User user) {
        this(user, "");
    }

    public SMS(User user, String text) {
        super(user, text);
    }

    public void send() {
        System.out.println(
                "Message: SMS" +
                        "\n- content: " + (this.charNumber() > 0 ? this.getText() : "<empty message>") +
                        "\n- length: " + this.charNumber() +
                        "\n- phone number: " + this.getUser().getPhoneNumber()
        );
    }
}
