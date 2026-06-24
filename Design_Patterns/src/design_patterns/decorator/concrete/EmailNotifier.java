package design_patterns.decorator.concrete;

import design_patterns.decorator.interfaces.Notifier;

public class EmailNotifier implements Notifier {
    public void send(String message){
        System.out.println("Email Notifier: " + message);
    }
}
