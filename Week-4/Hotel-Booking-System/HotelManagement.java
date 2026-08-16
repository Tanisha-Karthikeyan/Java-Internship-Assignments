import java.util.Scanner;

public class HotelManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();

        int choice;

        do {
            System.out.println("\n===== Hotel Booking Management System =====");
            System.out.println("1. View Available Rooms");
            System.out.println("2. Add Booking");
            System.out.println("3. View Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    hotel.displayAvailableRooms();
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();

                    hotel.displayAvailableRooms();

                    System.out.print("Enter room number: ");
                    int roomNumber = scanner.nextInt();

                    System.out.print("Enter number of nights: ");
                    int nights = scanner.nextInt();

                    hotel.addBooking(customerName, roomNumber, nights);
                    break;

                case 3:
                    hotel.displayBookings();
                    break;

                case 4:
                    System.out.print("Enter booking ID to cancel: ");
                    int bookingId = scanner.nextInt();

                    hotel.cancelBooking(bookingId);
                    break;

                case 5:
                    System.out.println("Thank you for using the Hotel Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        scanner.close();
    }
}