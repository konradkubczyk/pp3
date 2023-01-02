public class Main {
    public static void main(String[] args) {
        User user = new User("John", "Smith", "john@smith.com", "123 456 789");

        SMS sms1 = new SMS(user);
        SMS sms2 = new SMS(user, "Test SMS message content");
        System.out.println();
        sms1.send();
        System.out.println();
        sms2.send();

        Email email1 = new Email(user, "Email 1");
        Email email2 = new Email(user, "Email 2", "Test email message content");
        System.out.println();
        email1.send();
        System.out.println();
        email2.send();
    }
}
