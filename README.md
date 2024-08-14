### Task HotelReservationSystem ###
### Hotel Reservation System ###
This Java-based console application simulates a simple Hotel Reservation System. It allows users to view available rooms, make reservations, and check their booking details.

Features
Room Display: View a list of available rooms with their types and prices.
Room Reservation: Reserve a room by specifying its room number. Each reservation generates a unique booking ID.
Booking Check: Retrieve booking details using the booking ID.
Exit: Option to exit the application.
How It Works
1. Show Available Rooms
The application displays all available rooms along with their types (Single, Double, Suite) and costs. Rooms that are already booked are not shown.

2. Reserve a Room
Users can book a room by entering the room number. The system checks if the room is available. If available, the room is marked as booked, and the system provides a unique booking ID.

3. Check Booking
Users can check the details of their booking by entering their unique booking ID. The system retrieves and displays the booking information.

4. Exit
The user can exit the application at any time by selecting the exit option.

Usage
Clone the repository to your local machine.
Compile the HotelReservationSystem class.
Run the application.
Follow the on-screen instructions to use the features.
bash
Copy code
javac HotelReservationSystem.java
java HotelReservationSystem
Code Structure
Room Class: Represents individual rooms in the hotel. Each room has a type, cost, and availability status.
HotelReservationSystem Class: Manages the list of rooms and bookings, and handles user interactions.
Main Method: Provides a simple command-line interface for the user to interact with the system.
Example Interaction
mathematica
Copy code
1. Show Rooms 2. Book Room 3. Check Booking 4. Exit: 1
Room 101: Single - $100.0
Room 102: Double - $150.0
Room 103: Suite - $250.0

1. Show Rooms 2. Book Room 3. Check Booking 4. Exit: 2
Enter room number: 101
Booked! Your booking ID: 1

1. Show Rooms 2. Book Room 3. Check Booking 4. Exit: 3
Enter booking ID: 1
Booking ID: 1 - Room 101 (Single) - $100.0
Requirements
Java Development Kit (JDK) 8 or higher
License
This project is open-source and available under the MIT License.
