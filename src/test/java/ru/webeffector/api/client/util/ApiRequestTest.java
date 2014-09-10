package ru.webeffector.api.client.util;

import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.Iterator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApiRequestTest {

    @Test
    public void testGetUrl() throws Exception {
        Iterator i = mock(Iterator.class);
        System.out.println(i.next());
        when(i.next()).thenAnswer(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "dsf";
            }
        });
    }
}