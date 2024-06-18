package model;

public class Motorcycle extends Vehicle{

    @Override
    public void fuelEfficiency(){
        System.out.println("2.1 mpg");
    }

    @Override
    public void disTanceTraveled(){
        System.out.println("4.41 miles");
    }

    @Override
    public void maxSpeed(){
        System.out.println("80.0 mph");
    }
}
