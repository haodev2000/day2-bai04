package model;

public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck();
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        truck.setBrand("Tatra 810 4x4");
        car.setBrand("Virtus");
        motorcycle.setBrand("Warrior200");

        System.out.println("Truck Model : " + truck.getBrand());
        truck.fuelEfficiency();
        truck.disTanceTraveled();
        truck.maxSpeed();

        System.out.println("");

        System.out.println("Truck Model : " + car.getBrand());
        car.fuelEfficiency();
        car.disTanceTraveled();
        car.maxSpeed();

        System.out.println("");

        System.out.println("Truck Model : " + motorcycle.getBrand());
        motorcycle.fuelEfficiency();
        motorcycle.disTanceTraveled();
        motorcycle.maxSpeed();

    }
}
