package org.example.unitTesting.unittesting.List;


import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;


import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;


public class ListMockTest {
    List<String> mock= mock(List.class);

    @Test
    public void test(){

        when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());


    }
    @Test
    public void returnWithparameters(){

        when(mock.get(0)).thenReturn("hello");
        assertEquals("hello",mock.get(0));



    }
    @Test
    public void returnwithgenericparameters(){

        when(mock.get(anyInt())).thenReturn("hello");
        assertEquals("hello",mock.get(0));
        assertEquals("hello",mock.get(10));



    }

    @Test
    public void verfiybasic(){
        String value1=mock.get(0);
        String value2=mock.get(2);
        //verify
        verify(mock).get(0);
        verify(mock,times(2)).get(anyInt());
        verify(mock,atLeast(1)).get(anyInt());
        verify(mock,atMost(2)).get(anyInt());
    }

    @Test
    public void Argumentcapture(){
        mock.add("hii");
        mock.add("hello");

        ArgumentCaptor<String> captor=ArgumentCaptor.forClass(String.class);

        verify(mock,times(2)).add(captor.capture());
        List<String> allvalues=captor.getAllValues();
        assertEquals("hii",allvalues.get(0));
        assertEquals("hello",allvalues.get(1));

    }

}
