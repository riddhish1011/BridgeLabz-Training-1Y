import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in 3rd column
    public static void calculateBMI(double[][] data) {

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];      // weight in kg
            double heightCm = data[i][1];    // height in cm

            double heightMeter = heightCm / 100.0;

            double bmi = weight / (heightMeter * heightMeter);

            data[i][2] = bmi;   // Store BMI in 3rd column
        }
    }

    // Method to determine BMI Status
    public static String[] getBMIStatus(double[][] data) {

        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {

            double bmi = data[i][2];

            if (bmi < 18.5)
                status[i] = "Underweight";
            else if (bmi >= 18.5 && bmi < 25)
                status[i] = "Normal Weight";
            else if (bmi >= 25 && bmi < 30)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3]; 
