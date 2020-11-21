//Basic Java Program to check whether given string is palindrome or not
import java.util.Scanner;

public class PalindromeORNot {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the String : ");
            String palindrome = scanner.next();
            char[] array = palindrome.toCharArray();
            StringBuilder stringBuilder = new StringBuilder(palindrome.length());
            for (int i = palindrome.length() - 1; i >= 0; i--) {
                stringBuilder.append(array[i]);
            }
            String reverserdString = stringBuilder.toString();
            if (reverserdString.equalsIgnoreCase(palindrome)) {
                System.out.println("String is Palindrome");
            } else {
                System.out.println("String is not Palindrome");
            }
            scanner.close();
        }
        catch(Exception exception){
            System.out.println("Please check the input and retry with correct input");
        }
    }
}