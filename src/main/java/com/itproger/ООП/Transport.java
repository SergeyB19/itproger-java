package com.itproger.ООП;

public class Transport {
    public float speed;
    public int weight;
    protected String color;
    public byte[] coordinate;

    public Transport() {
        System.out.println("Object created");
    }

    public Transport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
    }

    public Transport(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }



    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight " + weight + " Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;

    }


}
