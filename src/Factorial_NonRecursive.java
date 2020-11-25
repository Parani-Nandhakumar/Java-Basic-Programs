import java.util.Scanner;

public class Factorial_NonRecursive {
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter the number : ");
            int number = scanner.nextInt();
            for(int i=number-1;i>0;i--){
                number = number * i;
            }
            System.out.println("Factorial is : " + number);
        }
        catch(Exception exception){
            System.out.println("Entered number is invalid. Please enter valid number");
        }
    }
}