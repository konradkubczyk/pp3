public class Email extends Message {
    private String subject, recipientAddress;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public Email(String subject, String recipientAddress) {
        this.subject = subject;
        this.recipientAddress = recipientAddress;
    }

    public Email(String text, String subject, String recipientAddress) {
        super(text);
        this.subject = subject;
        this.recipientAddress = recipientAddress;
    }

    public void send() {
        System.out.println(
            "Message: Email" +
            "\n- content: " + (this.charNumber() > 0 ? this.getText() : "<empty message>") +
            "\n- length: " + this.charNumber() +
            "\n- subject: " + this.getSubject() +
            "\n- recipient: " + this.getRecipientAddress()
        );
    }
}
