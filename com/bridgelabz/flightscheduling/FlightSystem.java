package com.bridgelabz.flightscheduling;

// Main class to maintain flight scheduling using generics
class FlightSystem {
    public static void main(String[] args) {
        // Create objects of flight with different data types
        Flight<Integer> flight1 = new Flight<>(101, "Delhi", "London");
        Flight<String> flight2 = new Flight<>("11AA", "Chandigarh", "Bengaluru");

        // Create objects of booking class
        Booking<Integer> booking1 = new Booking<>(5001, flight1, "Jane Smith");
        Booking<String> booking2 = new Booking<>("B102", flight1, "Aman Sharma");

        // Display booking details
        booking1.displayBookingDetails();
        System.out.println();
        booking2.displayBookingDetails();

        // Create an object of flight manager and display details
        System.out.println("\n--- Flight Management ---");
        FlightManager<String> manager = new FlightManager<>();
        manager.addFlight(flight2);
        manager.displayFlights();
    }
}
// Sample output ->
// Booking Confirmed...
// Booking ID: 5001
// Passenger: Jane Smith
// Flight Details: 
// Flight Number: 101| From: Delhi| To: London

// Booking Confirmed...
// Booking ID: B102
// Passenger: Aman Sharma
// Flight Details: 
// Flight Number: 101| From: Delhi| To: London

// --- Flight Management ---
// Flight Number: 11AA| From: Chandigarh| To: Bengaluru