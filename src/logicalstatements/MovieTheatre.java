package logicalstatements;

import java.util.Scanner;

public class MovieTheatre {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Movie Theatre");
        System.out.println("we have three types of movie tickets");

        System.out.print("Enter silver ticket price : ");
        double silverTicketPrice = scanner.nextDouble();

        System.out.print("Enter Gold Ticket Price : ");
        double goldTicketPrice = scanner.nextDouble();

        System.out.print("Enter Platinum ticket price : ");
        double platinumTicketPrice = scanner.nextDouble();

        scanner.nextLine();

        char again;

        do {
            System.out.print("Enter your Choice (Silver/Gold/platinum) : ");
            String choice = scanner.nextLine();

            System.out.print("Enter your Age : ");
            int customerAge = scanner.nextInt();

            scanner.nextLine();

            double ticketPrice;

            switch (choice.toLowerCase()) {
                case "silver":
                    ticketPrice = (customerAge >= 60) ? silverTicketPrice - (silverTicketPrice * 10 / 100)
                            : silverTicketPrice;
                    System.out.println("Your Silver Ticket Price : " + ticketPrice);
                    break;
                case "gold":
                    ticketPrice = (customerAge >= 60) ? goldTicketPrice - (goldTicketPrice * 10 / 100)
                            : goldTicketPrice;
                    System.out.println("Your Gold Ticket Price : " + ticketPrice);
                    break;
                case "platinum":
                    ticketPrice = (customerAge >= 60) ? platinumTicketPrice - (platinumTicketPrice * 10 / 100)
                            : platinumTicketPrice;
                    System.out.println("Your Platinum Ticket Price : " + ticketPrice);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

            System.out.print("Calculate another ticket? (Y/N): ");
            again = scanner.next().charAt(0);
            scanner.nextLine();

        } while (again == 'Y' || again == 'N');

        System.out.println("Thank you for using our Movie Theatre");
        scanner.close();
    }
}
