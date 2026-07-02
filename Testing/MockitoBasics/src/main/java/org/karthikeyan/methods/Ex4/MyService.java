package org.karthikeyan.methods.Ex4;

import org.karthikeyan.methods.Ex4.ExternalApi;

public class MyService {
    ExternalApi externalApi;
    public MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public void testApi(){
        externalApi.requestApiCall();
    }
}
