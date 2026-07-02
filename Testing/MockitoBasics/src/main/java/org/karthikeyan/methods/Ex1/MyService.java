package org.karthikeyan.methods.Ex1;

public class MyService {
    ExternalApi externalApi;
    MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public String fetchData(){
        return externalApi.getData();
    }
}
