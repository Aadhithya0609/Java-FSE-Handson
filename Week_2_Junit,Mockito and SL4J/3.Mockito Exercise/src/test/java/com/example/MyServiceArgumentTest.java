package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceArgumentTest {
    @Test
    void testWithArgumentMatcher() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        service.submitData("test123");

        verify(mockApi).sendData(eq("test123"));
    }
}
