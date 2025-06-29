package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceVoidExceptionTest {
    @Test
    void testVoidException() {
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("API failed"))
            .when(mockApi).notifyUser("badUser");

        MyService service = new MyService(mockApi);

        assertThrows(RuntimeException.class, () -> service.notify("badUser"));
    }
}
