package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:46
 **/


public class Demo {

    public static void main(String[] args) {
        AbstractFactory abstractFactory;
        abstractFactory=FactoryProvider.getFactory("Bank");
        Bank b = (Bank) abstractFactory.create("ICICI");

        abstractFactory=FactoryProvider.getFactory("Loan");
        Loan l = (Loan) abstractFactory.create("HomeLoan");

        System.out.println("Bank : "+b.getBankName()+", Loan Type : "+l.getLoanName());
    }

}
