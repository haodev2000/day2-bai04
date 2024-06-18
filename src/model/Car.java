package model;

public class Car extends Vehicle {

    @Override
    public void fuelEfficiency(){
        System.out.println("2.355 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("14.4 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("120.0 mph");
    }
}
