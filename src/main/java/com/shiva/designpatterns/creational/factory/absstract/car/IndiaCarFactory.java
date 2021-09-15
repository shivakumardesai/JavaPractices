package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:10
 **/


public class IndiaCarFactory implements Factory{
    @Override
    public  Car buildCar(CarType type) {
           switch (type) {
               case MINI:
                   return new MiniCar(Location.INDIA);
               case MICRO:
                   return new MicroCar(Location.INDIA);
               case LUXURY:
                   return new LuxuryCar(Location.INDIA);
           }
        return null;
    }
}
