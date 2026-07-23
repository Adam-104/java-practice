package constructors;

import java.util.Scanner;

public class Patient {
    String patientName;
    int patientAge;
    double roomChargePerDay;
    int daysAdmitted;

    Patient(String patientName, int patientAge, double roomChargePerDay, int daysAdmitted) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.roomChargePerDay = roomChargePerDay;
        this.daysAdmitted = daysAdmitted;
    }

    void patientInfo(){
        System.out.println("Patient Details");
        System.out.println("---------------------");
        System.out.println("Patient Name         : " + patientName);
        System.out.println("Patient Age          : " + patientAge);
        System.out.println("Room Charge Per Day  : " + roomChargePerDay);
        System.out.println("Days Admitted        : " + daysAdmitted);
        System.out.println("Total Hospital Bill  : " + calculateTotalBill());
        System.out.println("--------------------");
    }

    double calculateTotalBill(){
        return (roomChargePerDay * daysAdmitted);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String patientName = input.nextLine();

        System.out.print("Enter Patient Age: ");
        int patientAge = input.nextInt();

        System.out.print("Enter Room Charge Per Day: ");
        double roomChargePerDay = input.nextDouble();

        System.out.print("Enter Days Admitted: ");
        int daysAdmitted = input.nextInt();


        System.out.println();

        Patient patient =  new Patient(patientName, patientAge, roomChargePerDay, daysAdmitted);
        patient.patientInfo();

        input.close();
    }
}
