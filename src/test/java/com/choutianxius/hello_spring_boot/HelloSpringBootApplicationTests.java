package com.choutianxius.hello_spring_boot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringBootApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void applicationStarts() {
		HelloSpringBootApplication.main(new String[] {});
	}

}
