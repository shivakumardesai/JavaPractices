package com.shiva.designpatterns.creational.factory.absstract.banknloan;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 12:39
 **/


public interface AbstractFactory<T> {
    T create(String objectType) ;

}
