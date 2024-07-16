package com.choutianxius.hello_spring_boot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GreetingControllerTest {

    private final GreetingController controller = new GreetingController();
    private final String testName = "John Doe";

    @Test
    public void greetingThenCorrectContent() {
        Greeting greeting = controller.greeting(testName);
        assertEquals("Hello, " + testName + "!", greeting.content());
    }

    @Test
    public void greetingThenIncrementingId() {
        Greeting greeting1 = controller.greeting(testName);
        Greeting greeting2 = controller.greeting(testName);
        assertEquals(1, greeting2.id() - greeting1.id());
    }

}
