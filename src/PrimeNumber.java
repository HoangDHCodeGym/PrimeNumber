import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int number = scanner.nextInt();
        System.out.println(PrimeNumber.checkPrime(number));
    }
    public static String checkPrime(int number) {
        if (number < 2) {
            return "This is not a prime number";
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "This is not a prime number";
            }
        }
        return "This is a prime number";
    }
}
