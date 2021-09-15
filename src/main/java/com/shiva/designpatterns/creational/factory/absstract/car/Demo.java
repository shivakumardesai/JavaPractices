package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:20
 **/


public class Demo {
    public static void main(String[] args) {
        System.out.println(AbstractCarFactory.buildCar(CarType.MICRO));
        System.out.println(AbstractCarFactory.buildCar(CarType.MINI));
        System.out.println(AbstractCarFactory.buildCar(CarType.LUXURY));
    }
}
