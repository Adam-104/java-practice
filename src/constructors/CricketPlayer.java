package constructors;

import java.util.Scanner;

public class CricketPlayer {
    static Scanner input = new Scanner(System.in);
    int jerseyNumber;
    String playerName;
    int matchesPlayed;
    int totalRuns;

    CricketPlayer(int jerseyNumber, String playerName, int matchesPlayed, int totalRuns){
        this.jerseyNumber = jerseyNumber;
        this.playerName = playerName;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
    }

    public double calculateAverage(){
        return (double) totalRuns / matchesPlayed;
    }

    public void display(){
        System.out.println("\nPlayer Details");
        System.out.println("----------------------------");
        System.out.println("Player Jersey Number    : " + jerseyNumber);
        System.out.println("Player Name             : " + playerName);
        System.out.println("Matches Played          : " + matchesPlayed);
        System.out.println("Total Runs              : " + totalRuns);
        System.out.printf("Average                : %.2f%n", calculateAverage());
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Cricket Player!");

        System.out.print("enter player jersey number: ");
        int jerseyNumber = input.nextInt();

        input.nextLine();

        System.out.print("enter player name: ");
        String playerName = input.nextLine();

        System.out.print("enter matches played: ");
        int matchesPlayed = input.nextInt();

        System.out.print("enter total runs: ");
        int totalRuns = input.nextInt();

        CricketPlayer player = new CricketPlayer(jerseyNumber, playerName, matchesPlayed, totalRuns);

        player.display();

        input.close();
    }
}
