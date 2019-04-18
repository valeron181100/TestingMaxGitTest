package com.company;

import java.io.Serializable;

public class Car implements Serializable {

    private Wheel[] wheels = new Wheel[4];

    private String name;

    public Car(String name){
        this.name = name;

        Wheel wheel = new Wheel();

        for(int i = 0; i < wheels.length; i++){
            wheels[i] = wheel;
        }

    }

    public String getName() {
        return name;
    }

    public Wheel[] getWheels() {
        return wheels;
    }



    class Wheel{
        private String color = "Black";

        public String getColor() {
            return color;
        }
    }
}
