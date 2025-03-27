package com.bridgelabz.flightscheduling;

import java.util.ArrayList;

// Generic class to maintain flight system with bounded types
class FlightManager<T extends String> {
    // ArrayList to store flights
    private final ArrayList<Flight<T>> flights = new ArrayList<>();

    // method to add flight in the array
    public void addFlight(Flight<T> flight) {
        flights.add(flight);
    }

    // method to remove a flight from system
    public void removeFlight(T flightNumber) {
        boolean found = false;
        for(Flight<T> flight:flights) {
            if(flight.getFlightNumber()==flightNumber){
                System.out.println("Removed flight details: ");
                flight.displayFlightDetails();
                flights.remove(flight);
                found = true;
                break;
            }
        }
        if(!found) System.out.println("Flight with number: " + flightNumber + " not found");
    }

    // method to display all flights with details
    public void displayFlights() {
        for(Flight<T> flight:flights) {
            flight.displayFlightDetails();
        }
    }
}
