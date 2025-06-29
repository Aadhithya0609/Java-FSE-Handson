package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceMultipleReturnsTest {
    @Test
    void testMultipleReturns() {
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.fetchNext())
            .thenReturn("First")
            .thenReturn("Second")
            .thenReturn("Third");

        MyService service = new MyService(mockApi);

        assertEquals("First", service.getNextMessage());
        assertEquals("Second", service.getNextMessage());
        assertEquals("Third", service.getNextMessage());
    }
}
