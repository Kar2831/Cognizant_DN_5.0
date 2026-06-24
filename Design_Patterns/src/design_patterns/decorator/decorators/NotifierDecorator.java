package design_patterns.decorator.decorators;

import design_patterns.decorator.interfaces.Notifier;

public abstract class NotifierDecorator implements Notifier {
    Notifier notifier;
    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }
    public void send(String message){
        notifier.send(message);
    }
}
