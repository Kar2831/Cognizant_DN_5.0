package org.karthikeyan.methods.Ex6;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.inOrder;

public class MyServiceTest {
    @Test
    public void testMethod(){
        MyService mockService = Mockito.mock(MyService.class);
        mockService.firstMethod();
        mockService.secondMethod();
        mockService.thirdMethod();
        mockService.fourthMethod();

        InOrder inorder = inOrder(mockService);

        inorder.verify(mockService).firstMethod();
        inorder.verify(mockService).secondMethod();
        inorder.verify(mockService).thirdMethod();
        inorder.verify(mockService).fourthMethod();
        inorder.verifyNoMoreInteractions();
    }
}


