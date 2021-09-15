package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:32
 **/


public class HdfcBank implements Bank{
    private final String BNAME;

    public HdfcBank() {
        BNAME = "HDFC";
    }

    public String getBankName() {
        return BNAME;
    }
}
