package com.example.EurekaClient;

import org.apache.tomcat.jni.Local;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDate;

public class VoucherCode
{
    private Recipient recipient;
    private LocalDate expirationDate;
    private SpecialOffer offer;
    public VoucherCode (Recipient recipient, LocalDate expirationDate, SpecialOffer offer)
    {
        this.recipient = recipient;

        //check if the voucher expiration date is not before the current date
        if (!expirationDate.isBefore(LocalDate.now())) {
            this.expirationDate = expirationDate;
        }
        this.offer = offer;
    }
    public String generateVoucher()
    {
        SecureRandom sr = new SecureRandom();
        StringBuilder voucherCode = new StringBuilder() ;

        //to generate an unlimited possibilities of code numbers, it will start from 8 and then add a number randomly bound by 5
        int voucherNumbers = sr.nextInt(5) + 8;

        for (int i = 0; i < voucherNumbers ; i++)
        {
            voucherCode =  voucherCode.append(sr.nextInt(9));
        }
        //check if the generated voucherCode is already an old voucher number, otherwise will generate a new voucher
        if (!isItAnOldVoucher(voucherCode.toString()))
            return voucherCode.toString();
        else
            generateVoucher();

        //in case of failure to generate a new voucher such as an error in checking the db this should be handled as well
        return "";
    }
    //Check Database if the voucher already exist(return false to keep the method simple)
    private boolean isItAnOldVoucher(String code)
    {
        return false;
    }
    public Recipient getRecipient()
    {
        return recipient;
    }

    public void setRecipient(Recipient recipient)
    {
        this.recipient = recipient;
    }

    public LocalDate getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public SpecialOffer getOffer()
    {
        return offer;
    }

    public void setOffer(SpecialOffer offer)
    {
        this.offer = offer;
    }
}
