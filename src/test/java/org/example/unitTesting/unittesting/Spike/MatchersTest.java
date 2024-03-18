package org.example.unitTesting.unittesting.Spike;



import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.hasSize;

public class MatchersTest {


    @Test
    public void learning(){
        List<Integer> number=Arrays.asList(12,13,14,15);

        assertThat(number, hasSize(4));
        assertThat(number,hasItems(12,15));
    }
}
