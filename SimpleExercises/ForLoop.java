package SimpleExercises;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a number: ");
        int number = scanner.nextInt();

        System.out.println("Multiplication table(1-10)");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number*i));
        }
        scanner.close();
    }
}
