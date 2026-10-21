package com.gymapp.gym;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
public class GymApplicationTests {

    @Test
    void contextLoads() {
        // Passes if the whole application starts without an error.
    }
}
