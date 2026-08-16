public class Booking {

    private int bookingId;
    private String customerName;
    private Room room;
    private int nights;
    private double totalCost;

    public Booking(int bookingId, String customerName, Room room, int nights) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.room = room;
        this.nights = nights;
        this.totalCost = room.getPricePerNight() * nights;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void displayBooking() {
        System.out.println(
            "Booking ID: " + bookingId +
            " | Customer: " + customerName +
            " | Room: " + room.getRoomNumber() +
            " | Type: " + room.getRoomType() +
            " | Nights: " + nights +
            " | Total Cost: " + totalCost
        );
    }
}