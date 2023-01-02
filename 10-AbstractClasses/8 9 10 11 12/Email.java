public class Email extends Message {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Email(User user, String subject) {
        this(user, subject,"");
    }

    public Email(User user, String subject, String text) {
        super(user, text);
        this.setSubject(subject);;
    }

    public void send() {
        System.out.println(
            "Message: Email" +
            "\n- subject: " + this.getSubject() +
            "\n- content: " + (this.charNumber() > 0 ? this.getText() : "<empty message>") +
            "\n- length: " + this.charNumber() +
            "\n- recipient: " + this.getUser().getEmail()
        );
    }
}
