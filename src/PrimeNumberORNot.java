import java.util.Scanner;
//Basic Java Program to check whether given number is prime number or not
public class PrimeNumberORNot {
    public static void main(String[] args) {
        try{
            //created scanner object to receive input from user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the number to check prime number or composite number : ");
            //number variable of integer type would store the number to be checked
            int number = scanner.nextInt();
            if (number == 0 || number == 1) {
                System.out.println("Entered number is " + number + " Please enter proper number");
            }
            if (number == 2) {
                System.out.println("Entered number is " + number + " Please enter proper number");
            }
            if (number > 2) {
                if (number % 2 == 0) {
                    System.out.println("Entered number " + number + " is composite number");
                } else {
                    System.out.println("Entered number " + number + " is prime number");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Entered characters are not applicable to check the prime number/composite number");
        }
    }
}