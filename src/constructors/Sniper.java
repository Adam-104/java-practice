package constructors;

public class Sniper {
    String sniperName;
    int magazine;
    String knownFor;
    String precision;

    Sniper(){
        this("AWM");
    }

    Sniper(String sniperName){
        this(sniperName, 7);
    }

    Sniper(String sniperName,  int magazine){
        this(sniperName, magazine, "long range");
    }

    Sniper(String sniperName, int magazine, String knownFor){
        this(sniperName, magazine, knownFor, "99%");
    }

    Sniper(Sniper s, String sniperName,  int magazine){
        this(sniperName, magazine, s.knownFor, s.precision);
    }

    Sniper(String sniperName, int magazine, String knownFor,  String precision){
        this.sniperName = sniperName;
        this.magazine = magazine;
        this.knownFor = knownFor;
        this.precision = precision;
    }


    void sniperInfo(){
        System.out.println("Sniper Details");
        System.out.println("------------------------------");
        System.out.println("Name of the Sniper   : " + sniperName);
        System.out.println("Total Magazine       : " +  magazine);
        System.out.println("Mainly Known for     : " +  knownFor);
        System.out.println("Aim Precision        : " +  precision);
        System.out.println("------------------------------");
    }

    public static void main(String[] args){
        Sniper sniper = new Sniper();
        sniper.sniperInfo();

        Sniper sniper2 = new Sniper(sniper, "M82B", 10);
        sniper2.sniperInfo();

        Sniper sniper3 = new Sniper("VSK94", 12, "medium range", "90%");
        sniper3.sniperInfo();
    }
}
