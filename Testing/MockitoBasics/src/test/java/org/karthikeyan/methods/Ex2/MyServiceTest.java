package org.karthikeyan.methods.Ex2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class MyServiceTest {

    @Test
    public void testFetchData(){
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService myService = new MyService(mockApi);
        myService.fetchData();
        verify(mockApi).getData();
    }

}
