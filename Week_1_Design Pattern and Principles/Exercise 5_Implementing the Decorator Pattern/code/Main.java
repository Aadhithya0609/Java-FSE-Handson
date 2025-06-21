public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        Notifier multiChannelNotifier = new SlackNotifierDecorator(smsNotifier);

        multiChannelNotifier.send("System maintenance at 10 PM.");
    }
}
