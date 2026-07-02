package org.karthikeyan.methods.Ex1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testExternalApi(){
        ExternalApi mockApi= Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");
        MyService myService = new MyService(mockApi);
        String result = myService.fetchData();
        assertEquals("Mock Data", result);
    }

}
