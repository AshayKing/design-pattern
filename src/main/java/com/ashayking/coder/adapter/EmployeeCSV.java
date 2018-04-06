package com.ashayking.coder.adapter;

import java.util.StringTokenizer;

/**
 * 
 * @author Ashay S Patil
 *
 */
public class EmployeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmployeeCSV(String csv) {
        StringTokenizer tokenizer = new StringTokenizer(csv, ",");

        if (tokenizer.hasMoreElements()) {
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if (tokenizer.hasMoreElements()) {
            firstname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            lastname = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}