package com.ford;


public class Cars {
    String colour;
    String model;
    float mileage;
    public void startCar(){
        System.out.println("start");
    }
    public void changeGears(){
        System.out.println("gear changed");
    }
    public void stopCar(){
        System.out.println("stop");
    }
    public String getInfo() {
        return ("“Model:”" +model + "“ Colour:”" + colour + "“ Mileage:”" +mileage);
    }
    public static void main (String args[]){
        Cars Suzuki = new Cars();
        Suzuki.model = "Baleno";
        Suzuki.colour = "“Jet Black”";
        Suzuki.mileage = (float) 27.39;
        System.out.println(Suzuki.getInfo());
        Suzuki.startCar();
    }
}