package org.karthikeyan.methods.Ex3;

public class MyService {
    ExternalApi externalApi;
    MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public void processMessage(String message){
        String formatted = "ALERT " + message;
        externalApi.sendNotification(formatted, 1);
    }
}
