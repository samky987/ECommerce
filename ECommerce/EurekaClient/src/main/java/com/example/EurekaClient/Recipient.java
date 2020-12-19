package com.example.EurekaClient;

import java.security.SecureRandom;

public class Recipient {
    private String name;
    private String email;

    //its more better to generate a unique recipient id instead of checking the recipients by name and email
    private int recipientId;

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public Recipient(String name, String email)
    {
        this.name = name;
        if (!isEmailExist(email))
            this.email = email;
        else
            throw new IllegalArgumentException();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    //Check is the email already registered in the database(return false here for simplicity)
    private boolean isEmailExist (String email)
    {
        return false;
    }

    public void setEmail(String email)
    {
        if (isEmailExist(email))
        {
            //prompt the user with an error
        }
        else
            this.email = email;
    }




}
