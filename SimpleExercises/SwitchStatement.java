package SimpleExercises;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n---Simple Calculator---");
        System.out.println("--Pick 2 numbers--");
        System.out.print("Pick the first number: ");
        int n1 = scanner.nextInt();
        System.out.print("Pick the second number: ");
        int n2 = scanner.nextInt();
        System.out.println("\n--Pick an operation--");
        System.out.println("1. Multiply");
        System.out.println("2. Division");
        System.out.println("3. Addition");
        System.out.println("4. Subtraction");
        System.out.println("0. Exit...");
        System.out.print("Pick an option: ");
        int choice = scanner.nextInt();


        switch(choice){
            case 1:
                System.out.println("The output is: " + multiply(n1, n2));
                break;
            case 2:
                if (n2 != 0) {
                    System.out.println("The output is: " + divide(n1, n2));
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            case 3:
                System.out.println("The output is: " + add(n1, n2));
                break;
            case 4:
                System.out.println("The output is: " + sub(n1, n2));
                break;
            case 0:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid!");
        scanner.close();
        }

    }
    public static int multiply(int numOne, int numTwo){
        return numOne * numTwo;
    }
    public static int divide(int numOne, int numTwo) {
        return numOne / numTwo;
    }
    public static int add(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static int sub(int numOne, int numTwo){
        return numOne - numTwo;
    }
}
