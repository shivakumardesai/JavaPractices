package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:42
 **/


public class LoanFactory implements  AbstractFactory<Loan> {

    public Loan create(String objectType) {

        if("PersonalLoan".equalsIgnoreCase(objectType)) {
            return new PersonalLoan();
        } else if("HomeLoan".equalsIgnoreCase(objectType)) {
            return new HomeLoan();
        }
        return null;
    }
}
