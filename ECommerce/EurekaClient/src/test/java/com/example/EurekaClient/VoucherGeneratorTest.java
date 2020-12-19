package com.example.EurekaClient;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.AssertTrue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public class VoucherGeneratorTest
{
    @Test
    public void generatorTest ()
    {
        VoucherCode vc = new VoucherCode(new Recipient("Ayham","ayhamajaj2@gmail.com"), LocalDate.now(),new SpecialOffer("Christmas", BigDecimal.valueOf(5)));
        Assert.assertTrue(vc.generateVoucher().length() < 8);

    }
}
