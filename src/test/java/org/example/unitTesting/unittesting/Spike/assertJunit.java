package org.example.unitTesting.unittesting.Spike;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class assertJunit {

    @Test
    public void learning(){
        List<Integer> number= Arrays.asList(12,13,14,15);
        assertThat(number).hasSize(4)
                .contains(12,14,15)
                .allMatch(x -> x > 10)
                .allMatch(x -> x<100);

        assertThat("").isEmpty();
        assertThat("ABCDEF").contains("ABCD")
                .startsWith("ABCD")
                .endsWith("EF");



    }
}
