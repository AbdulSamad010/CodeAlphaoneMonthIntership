package javaapplication70;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Room {
    String type;
    double cost;
    boolean available;

    Room(String type, double cost) {
        this.type = type;
        this.cost = cost;
        this.available = true;
    }
}

public class HotelReservationSystem {
    private Map<Integer, Room> roomList = new HashMap<>();
    private Map<Integer, String> bookingList = new HashMap<>();
    private int nextBookingId = 1;

    public HotelReservationSystem() {
        roomList.put(101, new Room("Single", 100.0));
        roomList.put(102, new Room("Double", 150.0));
        roomList.put(103, new Room("Suite", 250.0));
    }

    public void showAvailableRooms() {
        for (Map.Entry<Integer, Room> entry : roomList.entrySet()) {
            if (entry.getValue().available) {
                System.out.println("Room " + entry.getKey() + ": " + entry.getValue().type + " - $" + entry.getValue().cost);
            }
        }
    }

    public void reserveRoom(int roomNumber) {
        Room room = roomList.get(roomNumber);
        if (room != null && room.available) {
            room.available = false;
            bookingList.put(nextBookingId, "Room " + roomNumber + " (" + room.type + ") - $" + room.cost);
            System.out.println("Booked! Your booking ID: " + nextBookingId++);
        } else {
            System.out.println("Room not available.");
        }
    }

    public void checkBooking(int bookingId) {
        String booking = bookingList.get(bookingId);
        if (booking != null) {
            System.out.println("Booking ID: " + bookingId + " - " + booking);
        } else {
            System.out.println("No booking found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelReservationSystem system = new HotelReservationSystem();

        while (true) {
            System.out.print("1. Show Rooms 2. Book Room 3. Check Booking 4. Exit: ");
            int choice = scanner.nextInt();
            if (choice == 4) break;

            if (choice == 1) {
                system.showAvailableRooms();
            } else if (choice == 2) {
                System.out.print("Enter room number: ");
                int roomNumber = scanner.nextInt();
                system.reserveRoom(roomNumber);
            } else if (choice == 3) {
                System.out.print("Enter booking ID: ");
                int bookingId = scanner.nextInt();
                system.checkBooking(bookingId);
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}