package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class MyServiceOrderTest {
    @Test
    void testInteractionOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.sendData("Step 1");
        mockApi.notifyUser("user123");

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).sendData("Step 1");
        inOrder.verify(mockApi).notifyUser("user123");
    }
}
