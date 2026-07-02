package demonSlayer;

public class Hashiras {
    //instance variables
    int hashiraRank;
    String hashiraName;
    String breathingStyle;

    //static variable
    static int totalHashiras = 10;
    static String hashiraMaster = "Kagaya Ubuyashiki";

    public static void main(String[] args){
        //Details of flame Hashira
        Hashiras rengoku = new Hashiras();
        rengoku.hashiraRank = 8;
        rengoku.hashiraName = "Kyojuro Rengoku";
        rengoku.breathingStyle = "Flame Breathing";

        System.out.println("Details of first Hashira");
        System.out.println("Total number of Hashiras: " + totalHashiras);
        System.out.println("Rank of Hashira: " + rengoku.hashiraRank);
        System.out.println("Name of Hashira: " + rengoku.hashiraName);
        System.out.println("Breathing Style of that Hashira: " + rengoku.breathingStyle);
        System.out.println("Master: " + hashiraMaster);
        System.out.println();

        Hashiras sanemi = new Hashiras();
        sanemi.hashiraRank = 2;
        sanemi.hashiraName = "Sanemi Shinazugawa";
        sanemi.breathingStyle = "Wind Breathing";

        System.out.println("Details of second Hashira");
        System.out.println("Total number of Hashiras: " + totalHashiras);
        System.out.println("Rank of Hashira: " + sanemi.hashiraRank);
        System.out.println("Name of Hashira: " + sanemi.hashiraName);
        System.out.println("Breathing Style of that Hashira: " + sanemi.breathingStyle);
        System.out.println("Master: " + hashiraMaster);
        System.out.println();

        Hashiras giyu = new Hashiras();
        giyu.hashiraRank = 2;
        giyu.hashiraName = "Giyu Tomioka";
        giyu.breathingStyle = "Water Breathing";

        System.out.println("Details of third Hashira");
        System.out.println("Total number of Hashiras: " + totalHashiras);
        System.out.println("Rank of Hashira: " + giyu.hashiraRank);
        System.out.println("Name of Hashira: " + giyu.hashiraName);
        System.out.println("Breathing Style of that Hashira: " + giyu.breathingStyle);
        System.out.println("Master: " + hashiraMaster);
        System.out.println();

        Hashiras obanai = new Hashiras();
        obanai.hashiraRank = 4;
        obanai.hashiraName = "Obanai Iguro";
        obanai.breathingStyle = "Snake Breathing";

        System.out.println("Details of fourth Hashira");
        System.out.println("Total number of Hashiras: " + totalHashiras);
        System.out.println("Rank of Hashira: " + obanai.hashiraRank);
        System.out.println("Name of Hashira: " + obanai.hashiraName);
        System.out.println("Breathing Style of that Hashira: " + obanai.breathingStyle);
        System.out.println("Master: " + hashiraMaster);
        System.out.println();


    }

}
