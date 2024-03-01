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

    @Override
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        super.setValues(_speed, _weight, _color, _coordinate);
        System.out.println("Наш второй метод");
    }

    @Override
    public String getValues() {
        return super.getValues();
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
