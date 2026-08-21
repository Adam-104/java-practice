//case study 4 :
//problem statement : A hospital records the temperatures og patients in an array.
//write a Java program to :
//1. Store the temperatures o N patients
//2. Find the highest tempreature
//3. Find the lowest temperature
//4. Count patients having fever (temperature >= 100.4f)
//5. Calculate the average temperature

package casestudiesbyvcube;

import java.util.Scanner;

public class HospitalPatientTemperatureAnalysis {
    static Scanner scanner = new Scanner(System.in);

    public void temperatureAnalysis(float[] patientTemperatures) {
        float highestTemperature = patientTemperatures[0];
        float lowestTemperature = patientTemperatures[0];
        int feverCount = 0;
        for (int i = 0; i < patientTemperatures.length; i++) {
            if (patientTemperatures[i] > highestTemperature) {
                highestTemperature = patientTemperatures[i];
            }
            if (patientTemperatures[i] < lowestTemperature) {
                lowestTemperature = patientTemperatures[i];
            }
            if (patientTemperatures[i] >= 100.4f) {
                feverCount++;
            }
        }

        System.out.printf("Highest temperature: %f\n", highestTemperature);
        System.out.printf("Lowest temperature: %f\n", lowestTemperature);
        System.out.printf("Fever count: %d\n", feverCount);
        System.out.println("Average temperature: " + (highestTemperature + lowestTemperature) / patientTemperatures.length);
    }

    public static void main(String[] args) {
        System.out.print("enter array size : ");
        int arraySize = scanner.nextInt();
        float[] patientTemperatures = new float[arraySize];
        System.out.print("enter patients temperature : ");
        for (int i = 0; i < patientTemperatures.length; i++) {
            patientTemperatures[i] = scanner.nextFloat();
        }
        HospitalPatientTemperatureAnalysis hpa = new HospitalPatientTemperatureAnalysis();
        hpa.temperatureAnalysis(patientTemperatures);
    }
}
