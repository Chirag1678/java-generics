package com.bridgelabz.flightscheduling;

// Generic class to maintain booking system
class Booking<T> {
    // Attributes
    private final T bookingId;
    private final Flight<?> flight; // As we don't know the object type of object class
    private final String passenger;

    // Constructor
    Booking(T bookingId, Flight<?> flight, String passenger) {
        this.bookingId = bookingId;
        this.flight = flight;
        this.passenger = passenger;
    }

    // method to display booking details
    public void displayBookingDetails() {
        System.out.println("Booking Confirmed...");
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger: " + passenger);
        System.out.println("Flight Details: ");
        flight.displayFlightDetails();
    }
}
