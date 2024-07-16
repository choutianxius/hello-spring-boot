package com.choutianxius.hello_spring_boot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingTest {

    @Test
    public void greetingConstructorThenOk() {
        Greeting greeting = new Greeting(1, "hi");
        assertEquals(1, greeting.id());
        assertEquals("hi", greeting.content());
    }
}
