package model;

public class Car extends Vehicle {

    @Override
    public void fuelEfficiency(){
        System.out.println(" Fuel Efficiency : 2.355 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("Distance Traveled : 14.4 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("Max Speed : 120.0 mph");
    }
}
