package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:35
 **/


public class HomeLoan implements Loan{

    private final String LNAME;

    public HomeLoan() {
        LNAME = "Home Loan";
    }

    public String getLoanName() {
        return LNAME;
    }
}
