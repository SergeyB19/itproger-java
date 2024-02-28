package com.itproger.наследование;

import com.itproger.ООП.Transport;

public class Car extends Transport {
    public Car() {
    }

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
        System.out.println("Object created");
    }
}
