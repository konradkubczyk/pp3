public abstract class Message {
    private String text;
    private User user;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message(User user) {
        this(user, "");
    }

    public Message(User user, String text) {
        this.setUser(user);
        this.setText(text);
    }

    public int charNumber() {
        return this.getText().length();
    }

    public abstract void send();
}
