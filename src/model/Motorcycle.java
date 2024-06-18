package model;

public class Motorcycle extends Vehicle{

    @Override
    public void fuelEfficiency(){
        System.out.println("Fuel Efficiency : 2.1 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("Distance Traveled : 4.41 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("Max Speed : 80.0 mph");
    }
}
