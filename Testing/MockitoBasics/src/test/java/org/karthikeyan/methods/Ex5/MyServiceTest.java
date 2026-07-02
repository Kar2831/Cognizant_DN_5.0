package org.karthikeyan.methods.Ex5;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class MyServiceTest {

    @Test
    public void testApiCall(){
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService myService = new MyService(mockApi);
//        when(mockApi.testExternalApi("String Family")).thenReturn("String");
//        when(mockApi.testExternalApi(10)).thenReturn(10);
//        when(mockApi.testExternalApi(20.0)).thenReturn("Hello");
        when(mockApi.testExternalApi(Mockito.any()))
                .thenReturn("First Input")
                .thenReturn("Second Input")
                .thenReturn(39.9);
        Object object = myService.getObject(39.9);
        Object object2 = myService.getObject(39.9);
        Object object3 = myService.getObject(39.9);
        System.out.println(object);
        System.out.println(object2);
        System.out.println(object3);
    }

}
