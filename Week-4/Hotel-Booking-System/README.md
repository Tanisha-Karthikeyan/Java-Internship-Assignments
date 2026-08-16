# Hotel Booking Management System

This is a Java project I made for managing hotel room bookings.

## Features

- View available rooms
- Add a booking
- View bookings
- Cancel a booking
- Calculate total booking cost
- Store bookings using ArrayList

## Technologies Used

- Java
- OOP
- ArrayList

## Files

Room.java

This file stores the room number, room type, price per night, and availability.

Booking.java

This file stores the booking details and calculates the total cost based on the room price and number of nights.

Hotel.java

This file manages the rooms and bookings using ArrayList. It handles adding and cancelling bookings.

HotelManagement.java

This is the main file. It contains the menu and takes input from the user.

## OOP Used

I used classes, objects, constructors, private variables, getters, setters, and methods in this project.

## ArrayList

I used ArrayList to store the rooms and current bookings.

## Total Cost

The total cost is calculated using:

Room price per night × Number of nights

For example:

1500 × 3 = 4500

## Testing

I tested:

- Viewing available rooms
- Adding a booking
- Calculating total cost
- Viewing bookings
- Cancelling a booking
- Checking room availability after cancellation

All the required features worked successfully.

## How to Run

Compile:

javac \*.java

Run:

java HotelManagement
