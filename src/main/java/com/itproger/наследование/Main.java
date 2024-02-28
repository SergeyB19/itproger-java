package com.itproger.наследование;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(250.5f, 2500, "White", new byte[]{0, 0, 0});

        Truck truck = new Truck(90,5600, "Green",new byte[]{100, 0, 100},true);

        truck.setLoaded(true);
        truck.getLoaded();
    }
}
