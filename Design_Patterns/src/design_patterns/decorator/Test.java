package design_patterns.decorator;

import design_patterns.decorator.concrete.EmailNotifier;
import design_patterns.decorator.decorators.SMSNotifierDecorator;
import design_patterns.decorator.decorators.SlackNotifierDecorator;
import design_patterns.decorator.interfaces.Notifier;

public class Test {
    public static void main(String[] args) {
        Notifier notifier = new SMSNotifierDecorator(new SlackNotifierDecorator(new EmailNotifier()));
        notifier.send("Message sent");
    }
}
