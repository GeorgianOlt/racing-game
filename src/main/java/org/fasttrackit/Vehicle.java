package org.fasttrackit;

public class Vehicle {


    // instance variables
    String name;
    double fuelLevel;
    double mileage;
    double totalTraveledDistance;
    double maxSpeed;


    boolean damaged;
    String color;

    public double accelerate(double speed, double durationInHours) {
         // Ferrari is accelerating with 100km/h for 1 hour.
        System.out.println(name + "is accelerating with" + speed + " km/h for" + durationInHours + "h");
// Local variable
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance = distance;

        // same result as statement above
      //  totalTraveledDistance += distance;
        System.out.println("Total traveled distance for vehicle" + name + ": " + totalTraveledDistance);
        double usedFuel = distance * mileage / 100;
        // fuelLevel = fuelLevel - usedFuel;
        // same statement as above
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel for vehicle" + name + ": " + fuelLevel);

        return distance;

    }
}
