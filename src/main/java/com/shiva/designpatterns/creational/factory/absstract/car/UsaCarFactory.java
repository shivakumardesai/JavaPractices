package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:13
 **/


public class UsaCarFactory implements Factory{
    @Override
    public Car buildCar(CarType type) {
        switch (type) {
            case MINI:
                return new MiniCar(Location.USA);
            case MICRO:
                return new MicroCar(Location.USA);
            case LUXURY:
                return new LuxuryCar(Location.USA);
        }
        return null;
    }
}
