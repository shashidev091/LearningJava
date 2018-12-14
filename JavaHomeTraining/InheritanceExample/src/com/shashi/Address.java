package com.shashi;

public class Address {
    String City;
    String Street;
    String District;
    String State;
    int pincode;

    Address(String City,String Street,String District,String State,int pincode) {
        this.City = City;
        this.Street = Street;
        this.District = District;
        this.State = State;
        this.pincode = pincode;
    }
}
