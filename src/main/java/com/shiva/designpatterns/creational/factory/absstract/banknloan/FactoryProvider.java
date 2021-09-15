package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:44
 **/


public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Bank")) {
            return new BankFactory();
        } else if(choice.equalsIgnoreCase("Loan")){
            return new LoanFactory();
        }
        return null;
    }
}
