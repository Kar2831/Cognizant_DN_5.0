package design_patterns.decorator.decorators;

import design_patterns.decorator.interfaces.Notifier;

public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier){
        super(notifier);
    }
    public void send(String message){
        super.send(message);
        System.out.println("SMS Notifier: " + message);
    }
}
