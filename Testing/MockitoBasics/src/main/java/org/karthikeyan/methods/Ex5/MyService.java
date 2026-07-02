package org.karthikeyan.methods.Ex5;

public class MyService {
    ExternalApi externalApi;
    public MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public Object getObject(Object object){
        return externalApi.testExternalApi(object);
    }
}
