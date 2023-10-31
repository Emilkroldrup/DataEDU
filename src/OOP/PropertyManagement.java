package OOP;

import java.util.ArrayList;

abstract class Property {
    protected double price;

    public Property(double price) {
        this.price = price;
    }

    public abstract void printData();

    public abstract double pricePerSquareMeter();
}

class Villa extends Property {
    private int numberOfRooms;
    private double inhabitedSquareMeters;

    public Villa(int numberOfRooms, double inhabitedSquareMeters, double price) {
        super(price);
        this.numberOfRooms = numberOfRooms;
        this.inhabitedSquareMeters = inhabitedSquareMeters;
    }

    @Override
    public void printData() {
        System.out.println("Villa:");
        System.out.println("Number of rooms: " + numberOfRooms);
        System.out.println("Inhabited square meters: " + inhabitedSquareMeters);
        System.out.println("Price: " + price);
        System.out.println("Price per square meter: " + pricePerSquareMeter());
    }

    @Override
    public double pricePerSquareMeter() {
        return price / inhabitedSquareMeters;
    }
}

class Shop extends Property {
    private double residentialArea;
    private double shopArea;

    public Shop(double residentialArea, double shopArea, double price) {
        super(price);
        this.residentialArea = residentialArea;
        this.shopArea = shopArea;
    }

    @Override
    public void printData() {
        System.out.println("Shop:");
        System.out.println("Residential area: " + residentialArea);
        System.out.println("Shop area: " + shopArea);
        System.out.println("Price: " + price);
        System.out.println("Price per square meter: " + pricePerSquareMeter());
    }

    @Override
    public double pricePerSquareMeter() {
        return price / (residentialArea + shopArea);
    }
}

class Floor extends Property {
    private double residentialArea;
    private double shopArea;
    private int numberOfFloors;

    public Floor(double residentialArea, double shopArea, int numberOfFloors, double price) {
        super(price);
        this.residentialArea = residentialArea;
        this.shopArea = shopArea;
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void printData() {
        System.out.println("Floor:");
        System.out.println("Residential area: " + residentialArea);
        System.out.println("Shop area: " + shopArea);
        System.out.println("Number of floors: " + numberOfFloors);
        System.out.println("Price: " + price);
        System.out.println("Price per square meter: " + pricePerSquareMeter());
    }

    @Override
    public double pricePerSquareMeter() {
        return price / (residentialArea + shopArea);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Villa(5, 120, 200000));
        properties.add(new Shop(80, 50, 150000));
        properties.add(new Floor(100, 70, 3, 300000));

        for (Property property : properties) {
            property.printData();
            System.out.println();
        }
    }
}
