package com.company;

public class PoliceCar extends Vehicle implements LandVehicle,IEmergency{
    private int numWheels;

    public PoliceCar(String name, int maxPassengers, double maxSpeed, int numWheels) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
    }

    public PoliceCar(String name, int numWheels) {
        super(name);
        this.numWheels = numWheels;
    }

    @Override
    public void soundSiren() {
        System.out.println("Weeee wooo!, weeee wooo!");

    }

    @Override
    public int getNumWheels() {
        return numWheels;
    }

    @Override
    public void drive() {
        System.out.println("Calling drive() method");

    }

    @Override
    public void setNumWheels(int numWheels) {
        this.numWheels=numWheels;

    }


    public void policePursuit(){
        System.out.println("We have a 3312! we need reinforcements");
    }
}
