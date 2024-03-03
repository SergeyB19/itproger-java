package com.itproger.наследование;

import com.itproger.ООП.Transport;

public class Car extends Transport {
    public Car() {
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью " + speed);
    }

    public Car(float speed, int weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
        System.out.println("Object created");
    }
}
