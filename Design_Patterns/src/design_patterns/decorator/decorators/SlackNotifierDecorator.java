package design_patterns.decorator.decorators;

import design_patterns.decorator.interfaces.Notifier;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier notifier){
        super(notifier);
    }
    public void send(String message){
        super.send(message);
        System.out.println("Slack Notifier: " + message);
    }
}
