public class Main {
    public static void main(String[] args) {
        SMS sms1 = new SMS("123 456 789");
        SMS sms2 = new SMS("Test SMS message content", "987 654 321");
        System.out.println();
        sms1.send();
        System.out.println();
        sms2.send();

        Email email1 = new Email("Email 1", "recipient1@example.com");
        Email email2 = new Email("Test email message content", "Email 2", "recipient1@example.com");
        System.out.println();
        email1.send();
        System.out.println();
        email2.send();
    }
}
