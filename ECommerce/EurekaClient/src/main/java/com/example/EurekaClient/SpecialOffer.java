package com.example.EurekaClient;

import java.math.BigDecimal;

public class SpecialOffer
{
    private String name;
    private BigDecimal percentage;

    public SpecialOffer(String name, BigDecimal percentage)
    {
        this.name = name;
        this.percentage = percentage;
    }
    //A utility method to check the percentage of an offer, return a dummy value 10
    public static double getOfferPercentageByName(String offerName)
    {
        if(offerName.equals("Christmas"))
            return 10;
        else
            return 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }



}
