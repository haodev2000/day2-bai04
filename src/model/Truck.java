package model;

public class Truck extends Vehicle{

    @Override
    public void fuelEfficiency(){
        System.out.println("8.075659532105526 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("65.50975012444003 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("80.0 mph");
    }
}
