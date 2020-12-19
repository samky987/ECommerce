package com.example.EurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(EurekaClientApplication.class, args);

        SpecialOffer offer = new SpecialOffer("Christmas",BigDecimal.valueOf(5.5));
        VoucherCode vc = new VoucherCode(new Recipient("SSS","@gmail.com"),
                LocalDate.of(4444,4,4), offer

        );

    }


}
