package constructors;

import java.util.Scanner;

public class Demons {
    static Scanner input = new Scanner(System.in);

    int demonRank;
    String name;
    int demonAge;
    int demonKills;
    String style;

    Demons(){
        System.out.println("no-arg constructor called");
    }

    Demons(int demonRank, String name) {
        this.demonRank = demonRank;
        this.name = name;
    }

    Demons(int demonRank, String name, int demonAge){
        this.demonRank = demonRank;
        this.name = name;
        this.demonAge = demonAge;
    }

    Demons(int demonRank, String name, int demonAge, int demonKills){
        this.demonRank = demonRank;
        this.name = name;
        this.demonAge = demonAge;
        this.demonKills = demonKills;
    }

    Demons(int demonRank, String name, int demonAge, int demonKills, String style){
        this.demonRank = demonRank;
        this.name = name;
        this.demonAge = demonAge;
        this.demonKills = demonKills;
        this.style = style;
    }

    void demonInfo(){
        System.out.println("Demon Details");
        System.out.println("------------------------");
        System.out.println("Rank of the Demon     : " + demonRank);
        System.out.println("Name of the Demon     : " + name);
        System.out.println("Age of the Demon      : " + demonAge);
        System.out.println("Demon Kills           : " + demonKills);
        System.out.println("Style of the Demon    : " + style);
    }

    public static void main(String[] args) {

        Demons d1 = new Demons();
        d1.demonInfo();

        Demons d2 = new Demons(3, "akaza");
        d2.demonInfo();

        Demons d3 = new Demons(1, "kokushibo", 500);
        d3.demonInfo();

        Demons d4 = new Demons(2, "doma", 220, 300);
        d4.demonInfo();

        Demons d5 = new Demons(6, "Gyutaro", 150, 600, "blood sickle");
        d5.demonInfo();
    }
}
