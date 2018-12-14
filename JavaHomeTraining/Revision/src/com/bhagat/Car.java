package com.bhagat;

public class Car extends InheritenceChallenge {
    String Model;
    double LowSpeed;
    int doors;
    double height;
    double width;
    public Car(String nameOfTheCar, int Gears, int Speed) {
        super(nameOfTheCar,"Super Car", 4, Gears,Speed);
    }
    public Car(){
        this("Default Model",40,5,1.2,4.6);
    }
    public Car(String Model,double LowSpeed,int doors,double height,double width){
        this.Model = Model;
        this.LowSpeed = LowSpeed;
        this.doors = doors;
        this.height = height;
        this.width = width;
    }

    @Override
    public void move(int speed) {
        System.out.println("This Car is most fater that any one you  anticipated");
        System.out.println();
        super.move(speed);
    }

    @Override
    public void TopSpeedOfTheVehicle(int GearsShifted) {
        super.TopSpeedOfTheVehicle(GearsShifted);
    }
    void DimensionOfTheCar(){
        double Dimension = height * width;
        System.out.println(Dimension);
    }
    void Steer(String turn){
        if(turn == "Right" || turn=="right"){
            System.out.println("Vehicle Moved to right, and slows to speed ");
        }
        else if (turn == "Left" || turn == "left"){
            System.out.println("Vehicle Moved to Left");
        }
        else{
        System.out.println("Going Straight");}
    }
}
