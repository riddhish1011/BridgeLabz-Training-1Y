package JAVAQUESTIONS;

    import java.util.*;

    public class FriendlyPair {

        public static int sumOfDivisors(int n) {
            int sum = 0;

            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            int num1 = 6;
            int num2 = 28;

            int sum1 = sumOfDivisors(num1);
            int sum2 = sumOfDivisors(num2);

            // Check friendly pair condition
            if ((float)sum1 / num1 == (float)sum2 / num2) {
                System.out.println("Yes, they are a friendly pair");
            } else {
                System.out.println("No, they are not a friendly pair");
            }
        }
    }

