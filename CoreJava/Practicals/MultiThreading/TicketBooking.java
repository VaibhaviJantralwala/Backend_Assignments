package MultiThreading;

public class TicketBooking {

    static int seats = 1; 

    static synchronized void bookSeat(String user) {
        if (seats > 0) {
            System.out.println(user + " booking seat...");
            seats--;
            System.out.println(user + " seat booked! Remaining: " + seats);
        } else {
            System.out.println(user + " — Sorry! No seats available.");
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(() -> bookSeat("Vaibhavi"));
        Thread t2 = new Thread(() -> bookSeat("Rahul"));
        Thread t3 = new Thread(() -> bookSeat("Sneha"));

        t1.start();
        t2.start();
        t3.start();
    }
}