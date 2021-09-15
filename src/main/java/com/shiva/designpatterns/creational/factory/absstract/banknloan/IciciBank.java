package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:33
 **/


public class IciciBank implements Bank{
    private final String BNAME;

    public IciciBank( ) {
        BNAME = "ICICI";
    }

    public String getBankName() {
        return BNAME;
    }
}
