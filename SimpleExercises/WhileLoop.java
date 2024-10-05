package SimpleExercises;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;
        while(i <= number){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
        scanner.close();
    }
}
