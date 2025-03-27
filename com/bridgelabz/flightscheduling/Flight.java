package com.bridgelabz.flightscheduling;

// Generic Class to maintain flights
class Flight<T> {
    // Attributes
    private final T flightNumber;
    private final String departure;
    private final String destination;

    // Constructor
    Flight(T flightNumber, String departure, String destination) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
    }

    // getter method for flight number
    public T getFlightNumber() {
        return flightNumber;
    }

    // method to display flight details
    public void displayFlightDetails() {
        System.out.println("Flight Number: " + flightNumber + "| From: " + departure + "| To: " + destination);
    }
}
