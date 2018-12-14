package com.bhagat;

public class Main {

    public static void main(String[] args) {
//        InheritenceChallenge i = new InheritenceChallenge("Dodge","SuperCar",4,6,200);
        Car c = new Car();
        c.move(200);
        c.TopSpeedOfTheVehicle(4);
        System.out.println();
        c.setNameOfTheVehicle("Dodge");
        c.setTypeOfTheVehicle("Super Car");
        c.TopSpeedOfTheVehicle(5);
        c.Steer("Left");
    }
}
