package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:07
 **/


public class LuxuryCar extends Car {

    LuxuryCar(Location location)
    {
        super(CarType.LUXURY,location );
        construct();
    }
    @Override
    void construct() {

    }
}
