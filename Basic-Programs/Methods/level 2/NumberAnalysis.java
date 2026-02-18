import java.util.Scanner;

public class NumberAnalysis {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    // Return 1 if num1 > num2
    // Return 0 if equal
    // Return -1 if num1 < num2
    public static int compare(int num1, int num2) {
        if (num1 > num2)
            return 1;
        else if (num1 == num2)
            return 0;
        else
            return -1;
    }

    public static void main(St
