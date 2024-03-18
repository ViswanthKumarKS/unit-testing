package org.example.unitTesting.unittesting.Spike;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonPathTest {

    @Test
    public void learning(){

        String responsefromService="[{\"id\":2,\"name\":\"bowl\",\"price\":200,\"quantity\":250}," +
                "{\"id\":3,\"name\":\"bat\",\"price\":20,\"quantity\":25}]";

        DocumentContext context=JsonPath.parse(responsefromService);
        int length=context.read("$.length()");
        assertThat(length).isEqualTo(2);

        List<String> name=context.read("$..name");
        assertThat(name).containsExactly("bowl","bat");


    }

}
