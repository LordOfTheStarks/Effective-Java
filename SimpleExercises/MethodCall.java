package SimpleExercises;

import java.util.Scanner;

public class MethodCall {
    public static boolean isPrime(int number){
        if(number < 2) return false;
        int i = 2;
        while (i <= Math.sqrt(number)){
            if (number % i == 0) return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}
