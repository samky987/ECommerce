package com.example.EurekaClient;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalTime;

@Controller
public class VoucherEndpoint
{

    @RequestMapping(value = { "consume_voucher" })
    @ResponseBody
    public static String req (String code, String email)
    {
        //if the voucher and email are in good format then return the page..
        if (!code.isEmpty() && code.length() > 8)
        {
            //set the voucher code as consumed and set the date of usage
            return "Voucher percentage: " + SpecialOffer.getOfferPercentageByName("Christmas") + " Date: " + LocalDate.now();

        }
        return "";
    }
    /*
    http://localhost:8877/consume_voucher?code=3555555525&email=ayhamajaj2@gmail.com

    */
}
