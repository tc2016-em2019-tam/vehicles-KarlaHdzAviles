package com.company;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    private int numWheels;
    private double displacement;

    public Hovercraft(String name, int maxPassengers, double maxSpeed, int numWheels, double displacement) {
        super(name, maxPassengers, maxSpeed);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    public Hovercraft(String name, int numWheels, double displacement) {
        super(name);
        this.numWheels = numWheels;
        this.displacement = displacement;
    }

    @Override
    public int getNumWheels() {
        return 0;
    }

    @Override
    public void drive() {

    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public double getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    @Override
    public void launch() {
        System.out.println("Calling Launch() method!");

    }

    public void enterLand(){
        System.out.println(" Hovercraft entering land!");
    }

    public void enterSea(){
        System.out.println("Hovercraft entering sea!");
    }



}
