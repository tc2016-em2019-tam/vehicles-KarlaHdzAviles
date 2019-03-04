package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep", 4, 120, 4);
        myArray[1] = new Jeep("Frank's Jeep", 4, 2, 140);
        myArray[2] = new Hovercraft("Sue's Hover-craft", 6, 80, 8, 4.1);
        myArray[3] = new Frigate("Money Waster", 6, 150, 1.2);
        myArray[4] = new PoliceCar("patrol 02", 4, 200, 4);

        LinkedList<Vehicle> myVehicles = new LinkedList<Vehicle>();
        myVehicles.add(myArray[0]);
        myVehicles.add(myArray[1]);
        myVehicles.add(myArray[2]);
        myVehicles.add(myArray[3]);
        myVehicles.add(myArray[4]);


        for (int i = 0; i < myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myArray[i];
                lv.drive();
            }
            if (myArray[i] instanceof IEmergency) {
                IEmergency sv = (IEmergency) myArray[i];
                sv.soundSiren();
            }
        }

        System.out.println("\n----------------------------\n");
        System.out.println("List of Vehicles:\n");

        for (
                int i = 0; i < myVehicles.size(); i++) {

            System.out.println(myVehicles.get(i).getName());

            if (myVehicles.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myVehicles.get(i);
                lv.drive();
            }

            if (myVehicles.get(i) instanceof IEmergency) {
                IEmergency sv = (IEmergency) myVehicles.get(i);
                sv.soundSiren();
            }
        }
    }
}



