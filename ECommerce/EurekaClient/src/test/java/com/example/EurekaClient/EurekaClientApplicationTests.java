package com.example.EurekaClient;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class EurekaClientApplicationTests {

    @Test
    void contextLoads()
    {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Integer.parseInt("1a");
        });
        //assert if the email already exist
        Recipient recipient = new Recipient("Sam", "ayhamajaj2@gmail.com");
    }

}
