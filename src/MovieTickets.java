import java.util.Scanner;

public class MovieTickets {
    int ticketId;
    int screenNumber;
    double ticketPrice;
    boolean bookingStatus;
    int age;
    int numberOfSeats;
    long contactNumber;
    double GST;
    public static void main(String[] aargs){
        MovieTickets movieTickets = new MovieTickets();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ticket Id: ");
        movieTickets.ticketId = input.nextInt();
        System.out.print("Enter Screen Number: ");
        movieTickets.screenNumber = input.nextInt();
        System.out.print("Enter Ticket Price: ");
        movieTickets.ticketPrice = input.nextDouble();
        System.out.print("Enter Booking Status: ");
        movieTickets.bookingStatus = input.nextBoolean();
        System.out.print("Enter Age: ");
        movieTickets.age = input.nextInt();
        System.out.print("Enter Number of Seats: ");
        movieTickets.numberOfSeats = input.nextInt();
        System.out.print("Enter Contact Number: ");
        movieTickets.contactNumber = input.nextLong();
        System.out.print("Enter GST: ");
        movieTickets.GST = input.nextDouble();
        System.out.println();
        System.out.println("Ticket ID: " + movieTickets.ticketId);
        System.out.println("Screen Number: " + movieTickets.screenNumber);
        System.out.println("Ticket Price: " + movieTickets.ticketPrice);
        System.out.println("Booking Status: " + movieTickets.bookingStatus);
        System.out.println("Age: " + movieTickets.age);
        System.out.println("Number of Seats: " + movieTickets.numberOfSeats);
        System.out.println("Contact Number: " + movieTickets.contactNumber);
        System.out.println("GST: " + movieTickets.GST);
        input.close();
    }
}
