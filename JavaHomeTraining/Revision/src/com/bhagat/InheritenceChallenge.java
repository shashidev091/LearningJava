package com.bhagat;
import java.util.Scanner;
public class InheritenceChallenge {
    private String nameOfTheVehicle;
    private String TypeOfTheVehicle;
    private int Wheels;
    private int Gears;
    private  int Speed;
    Scanner s = new Scanner(System.in);
    public InheritenceChallenge(){
        this("DefaultName","DefaultType",4,5,200);
    }
    public InheritenceChallenge(String nameOfTheVehicle,String TypeOfTheVehicle,int Wheels,int Gears, int Speed){
        this.nameOfTheVehicle = nameOfTheVehicle;
        this.TypeOfTheVehicle = TypeOfTheVehicle;
        this.Wheels = Wheels;
        this.Gears = Gears;
        this.Speed = Speed;
    }

//    public String getNameOfTheVehicle() {
//        return nameOfTheVehicle;
//    }

    public void setNameOfTheVehicle(String nameOfTheVehicle) {
        this.nameOfTheVehicle = nameOfTheVehicle;
    }

//    public String getTypeOfTheVehicle() {
//        return TypeOfTheVehicle;
//    }

    public void setTypeOfTheVehicle(String typeOfTheVehicle) {
        TypeOfTheVehicle = typeOfTheVehicle;
    }

    public void move(int speed){
        System.out.println("The speed of the vehicle is "+speed);
    }
    void Drive(){
        System.out.println("Enter you Drive Type");
        String Type = s.next();
        System.out.println("Its \""+Type+"\" . ");
    }
    public void TopSpeedOfTheVehicle(int GearsShifted){
        int TopSpeed = Speed * (GearsShifted/2);
        System.out.println("The TopSpeed of the Vehicle is "+TopSpeed+" KM/hr");
        System.out.println(TypeOfTheVehicle+" "+nameOfTheVehicle);
    }
}
