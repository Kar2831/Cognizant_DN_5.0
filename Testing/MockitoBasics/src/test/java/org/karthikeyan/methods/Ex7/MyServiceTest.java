package org.karthikeyan.methods.Ex7;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

public class MyServiceTest {
    @Test
    public void testMethod(){
        MyService mockService = Mockito.mock(MyService.class);
        doThrow(RuntimeException.class).when(mockService).test(eq("String Message"), anyInt());
        assertThrows(RuntimeException.class, ()->{
           mockService.test("String Message", 6);
        });
        verify(mockService, times(1)).test("String Message", 6);
    }
}
