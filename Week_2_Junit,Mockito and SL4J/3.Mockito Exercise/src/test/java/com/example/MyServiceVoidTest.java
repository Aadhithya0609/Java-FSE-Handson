package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceVoidTest {
    @Test
    void testVoidMethod() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).notifyUser("user1");

        MyService service = new MyService(mockApi);
        service.notify("user1");

        verify(mockApi).notifyUser("user1");
    }
}
