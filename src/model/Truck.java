package model;

public class Truck extends Vehicle{

    @Override
    public void fuelEfficiency(){
        System.out.println("Fuel Efficiency: 8.075659532105526 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("Distance Traveled: 65.50975012444003 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("Max Speed : 80.0 mph");
    }
}
