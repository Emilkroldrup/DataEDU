package OOP;

import java.util.ArrayList;

public class Vehicle {
    protected double weightTax;
    protected String registrationNumber;

    public Vehicle(double weightTax, String registrationNumber) {
        this.weightTax = weightTax;
        this.registrationNumber = registrationNumber;
    }

    public void printData() {
        System.out.println("Vehicle type: " + this.getClass().getSimpleName());
        System.out.println("Weight tax: " + this.weightTax);
        System.out.println("Registration number: " + this.registrationNumber);
    }
}

class Car extends Vehicle {
    private double speed;
    private double engineSize;
    private int horsepower;

    public Car(double weightTax, String registrationNumber, double speed, double engineSize, int horsepower) {
        super(weightTax, registrationNumber);
        this.speed = speed;
        this.engineSize = engineSize;
        this.horsepower = horsepower;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Speed: " + this.speed);
        System.out.println("Engine size: " + this.engineSize);
        System.out.println("Horsepower: " + this.horsepower);
    }
}

class Truck extends Vehicle {
    private int horsePower;
    private int maxLoad;

    public Truck(double weightTax, String registrationNumber, int horsePower, int maxLoad) {
        super(weightTax, registrationNumber);
        this.horsePower = horsePower;
        this.maxLoad = maxLoad;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Horsepower: " + this.horsePower);
        System.out.println("Max load: " + this.maxLoad);
    }
}

class Bus extends Vehicle {
    private int numberOfPassengers;
    private int numberOfDoors;

    public Bus(double weightTax, String registrationNumber, int numberOfPassengers, int numberOfDoors) {
        super(weightTax, registrationNumber);
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Number of passengers: " + this.numberOfPassengers);
        System.out.println("Number of doors: " + this.numberOfDoors);
    }
}
/*
class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(1000, "123ABC", 120.5, 2.0, 150));
        vehicles.add(new Truck(2000, "456DEF", 200, 5000));
        vehicles.add(new Bus(1500, "789GHI", 50, 4));

        for (Vehicle vehicle : vehicles) {
            vehicle.printData();
            System.out.println();
        }
    }
}
 */
