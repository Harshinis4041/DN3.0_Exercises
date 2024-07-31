package DecoratorPatternExample;

public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("The Email is sent with a message or note read as: " + message);
    }
}
