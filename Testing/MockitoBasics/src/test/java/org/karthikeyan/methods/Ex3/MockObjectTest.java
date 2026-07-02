package org.karthikeyan.methods.Ex3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

public class MockObjectTest {
    @Test
    public void testMock(){
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService myService = new MyService(mockApi);
        myService.processMessage("SHUTDOWN");
        verify(mockApi).sendNotification(eq("ALERT SHUTDOWN"), anyInt());
    }
}
