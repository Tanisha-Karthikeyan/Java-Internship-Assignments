import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Room> rooms;
    private List<Booking> bookings;

    public Hotel() {
        rooms = new ArrayList<>();
        bookings = new ArrayList<>();

        rooms.add(new Room(101, "Single", 1500));
        rooms.add(new Room(102, "Double", 2500));
        rooms.add(new Room(103, "Deluxe", 3500));
        rooms.add(new Room(104, "Suite", 5000));
    }

    public void displayAvailableRooms() {

        System.out.println("\n===== Available Rooms =====");

        boolean found = false;

        for (Room room : rooms) {

            if (room.isAvailable()) {
                room.displayRoom();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No rooms are available.");
        }
    }

    public boolean addBooking(String customerName, int roomNumber, int nights) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                if (!room.isAvailable()) {
                    System.out.println("Room is already booked.");
                    return false;
                }

                if (nights <= 0) {
                    System.out.println("Number of nights must be greater than zero.");
                    return false;
                }

                int bookingId = bookings.size() + 1;

                Booking booking =
                        new Booking(bookingId, customerName, room, nights);

                bookings.add(booking);
                room.setAvailable(false);

                System.out.println("Booking added successfully.");
                System.out.println("Booking ID: " + bookingId);
                System.out.println("Total Cost: " + booking.getTotalCost());

                return true;
            }
        }

        System.out.println("Room not found.");
        return false;
    }

    public void displayBookings() {

        System.out.println("\n===== Current Bookings =====");

        if (bookings.isEmpty()) {
            System.out.println("No bookings found.");
            return;
        }

        for (Booking booking : bookings) {
            booking.displayBooking();
        }
    }

    public boolean cancelBooking(int bookingId) {

        for (Booking booking : bookings) {

            if (booking.getBookingId() == bookingId) {

                booking.getRoom().setAvailable(true);
                bookings.remove(booking);

                System.out.println("Booking cancelled successfully.");
                return true;
            }
        }

        System.out.println("Booking not found.");
        return false;
    }
}