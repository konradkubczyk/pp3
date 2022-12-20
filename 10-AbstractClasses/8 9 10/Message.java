public abstract class Message {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Message() {
        this("");
    }

    public Message(String text) {
        this.setText(text);
    }

    public int charNumber() {
        return this.getText().length();
    }

    public abstract void send();
}
