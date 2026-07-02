package variables;

public class June23CricketPlayer {
    static String teamName = "Sun Risers Hyderabad";

    int runs;
    int wickets;
    String playerName;

    public static void main(String[] args){
        June23CricketPlayer pat = new June23CricketPlayer();
        pat.runs = 199;
        pat.wickets = 34;
        pat.playerName = "pat Cummins";

        System.out.println("Name of the Fanchise: " + teamName);
        System.out.println("Palyer Name: " + pat.playerName);
        System.out.println("Runs Scored for Franchise: " + pat.runs);
        System.out.println("Wickets taken for Franchise: " + pat.wickets);
        System.out.println();

        June23CricketPlayer david = new June23CricketPlayer();
        david.runs = 4014;
        david.wickets = 1;
        david.playerName = "David Warner";

        System.out.println("Name of the Fanchise: " + teamName);
        System.out.println("Palyer Name: " + david.playerName);
        System.out.println("Runs Scored for Franchise: " + david.runs);
        System.out.println("Wickets taken for Franchise: " + david.wickets);

    }


}
