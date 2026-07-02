package org.karthikeyan.methods.Ex4;

import org.junit.jupiter.api.Test;
import org.karthikeyan.methods.Ex4.MyService;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class MyServiceTest {
    @Test
    public void testApiCall(){
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService myService = new MyService(mockApi);
        doNothing().when(mockApi).requestApiCall();
    }
}
