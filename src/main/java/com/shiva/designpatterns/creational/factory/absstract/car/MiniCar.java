package com.shiva.designpatterns.creational.factory.absstract.car;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-15 13:08
 **/


public class MiniCar extends Car{
  MiniCar(Location location) {
      super(CarType.MINI,location);
      construct();
  }

    @Override
    void construct() {

    }
}
