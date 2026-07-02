package org.karthikeyan.methods.Ex2;

import org.karthikeyan.methods.Ex2.ExternalApi;

public class MyService {
    ExternalApi externalApi;
    MyService(ExternalApi externalApi){
        this.externalApi = externalApi;
    }
    public void fetchData(){
        externalApi.getData();
    }
}
