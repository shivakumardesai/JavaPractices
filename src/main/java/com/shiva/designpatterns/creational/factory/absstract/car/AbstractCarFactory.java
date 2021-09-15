package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:15
 **/


public class AbstractCarFactory {
    public static Car buildCar(CarType type) {
        Car car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.USA;
        Factory f;
        switch (location) {
            case USA:
                f = new UsaCarFactory();
                car = f.buildCar(type);
                break;

            case INDIA:
                f = new IndiaCarFactory();
                car = f.buildCar(type);
                break;

            default:
                f = new DefaultCarFactory();
                car = f.buildCar(type);

        }
        return car;
    }
}