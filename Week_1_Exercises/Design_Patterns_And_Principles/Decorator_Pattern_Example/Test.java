package DecoratorPatternExample;

public class Test {
    public static void main(String[] args) {
        // EmailNotifier
        Notifier emailNotifier = new EmailNotifier();
        emailNotifier.send("Welcome Dear User! Glad to see you back again..!");

        // SMS functionality
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Welcome Dear User! Glad to see you back again..!");

        // Slack functionality
        Notifier slackNotifier = new SlackNotifierDecorator(new EmailNotifier());
        slackNotifier.send("Welcome Dear User! Glad to see you back again..!");

        // SMS and Slack functionalities
        Notifier combinedNotifier = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        combinedNotifier.send("Welcome Dear User! Glad to see you back again..!");
    }
}
