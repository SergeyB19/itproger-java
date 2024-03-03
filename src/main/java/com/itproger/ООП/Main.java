package com.itproger.ООП;

public class Main {
    public static void main(String[] args) {
        //ООП: классы и объекты
        Transport bmw = new Transport() {
            @Override
            public void moveObject(float speed) {

            }
        };
        bmw.setValues(250.0f, 2500, "White", new byte[]{0, 0, 0});
        String res1 = bmw.getValues();
        System.out.println(res1);
        bmw.speed = 250.0f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[]{0, 0, 0};

        Transport truck = new Transport() {
            @Override
            public void moveObject(float speed) {

            }
        };
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinate = new byte[]{100, 0, 100};
        String res2 = truck.getValues();
        System.out.println(res2);
        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);


    }
}

