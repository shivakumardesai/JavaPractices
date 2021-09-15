package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:41
 **/


public class BankFactory implements AbstractFactory<Bank>{
    public Bank create(String objectType) {
        if("HDFC".equalsIgnoreCase(objectType)) {
          return new HdfcBank();
        } else if("ICICI".equalsIgnoreCase(objectType)) {
            return new IciciBank();
        }
        return null;
    }
}
