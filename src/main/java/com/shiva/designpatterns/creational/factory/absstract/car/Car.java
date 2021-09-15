package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:05
 **/


abstract class Car {
    Car(CarType model, Location location)
    {
        this.model = model;
        this.location = location;
    }

    abstract void construct();

    CarType model = null;
    Location location = null;

    CarType getModel()
    {
        return model;
    }

    void setModel(CarType model)
    {
        this.model = model;
    }

    Location getLocation()
    {
        return location;
    }

    void setLocation(Location location)
    {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "CarModel - "+model + " located in "+location;
    }


}
