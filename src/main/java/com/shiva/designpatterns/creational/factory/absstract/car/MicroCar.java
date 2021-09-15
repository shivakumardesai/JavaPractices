package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:08
 **/


public class MicroCar extends Car{

    MicroCar(Location location)
    {
        super(CarType.MICRO,location );
        construct();
    }
    @Override
    void construct() {

    }
}
