package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:35
 **/


public class PersonalLoan implements Loan{
    private final String LNAME;

    public PersonalLoan() {
        LNAME = "Personal Loan";
    }

    public String getLoanName() {
        return LNAME;
    }
}
