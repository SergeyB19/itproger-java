package com.itproger.наследование;

import com.itproger.ООП.Transport;

public class Truck extends Transport {
    public Truck() {
    }
    public Truck(int weight, byte[] coordinate) {
        super(weight, coordinate);
        System.out.println("Object created");
    }

    public Truck(float speed, int weight, String color, byte[] coordinate, boolean isLoaded) {
        super(speed, weight, color, coordinate);
        this.isLoaded = isLoaded;
    }

    private boolean isLoaded;

    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Грузовик не загружен");

        }
    }
}
